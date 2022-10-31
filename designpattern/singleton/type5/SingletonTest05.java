package designpattern.singleton.type5;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式05
 * 这样保证了线程安全性，同时只有在第一次初始化的时候进行了加锁操作，也保证了效率
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 懒汉式（线程安全）
class Singleton {

    // 1. 构造方法私有化，避免出现new的情况
    private Singleton(){

    }

    // 2. 内部声明一个静态实例。必须要有volatile关键字修饰，没有该关键字调用getInstance方法可能会抛出异常
    // volatile作用在于避免指令重排和保证可见性
    // 个人理解：
    // 使用volatile的作用在于：对于volatile变量的读或写操作，之前的代码都一定是执行完毕的，之后的代码一定是还没有执行的。在JVM中并没有禁止指令的重排序操作（重排序就是CPU为了执行的效率，会对程序的代码指令进行重新排序操作，但是也会保证最后的结果和没有正常允许的代码结果一致）
    // 比如在 instance = new Singleton() 初始化操作来看，实际在java中并不是一个原子操作。同时，由于重排序的原因。对于初始化可以为：
    //  1. 对单例对象进行初始化操作 ==> 为单例对象分配内存空间 ==> 将instance引用指向内存空间
    //  2. 为单例对象分配内存空间 ==> 将instance引用指向内存空间 ==> 对单例对象进行初始化操作
    //  对于第二种情况，假设有两个线程同时访问getInstance方法，那么当第一个线程执行单例对象初始化时发生了第二种情况，并且只执行到将instance引用指向内存空间的时候，第二个线程正好才对instance == null 进行第一次检查，那么第二个线程返回的单例对象是初始化不完整的，就会导致bug。
    //  使用了volatile，就能保证instance这个变量在读操作或者写操作之前的指令一定都是完成了的，也就是单例对象一定是初始化完成后，才会将引用赋值到instance中，这样就避免了异常。

    /**
     * 额外：volatile关键字除了限制重排序外，还保证了变量的可见性。参考：https://www.cnblogs.com/dolphin0520/p/3920373.html
     * 前言：由于内存的读写速度比CPU执行指令的速度来说依旧是缓慢的。因此在主存和CPU之间还会有一个高速缓存。在CPU执行指令前，会先将需要运算的数据从主存中拷贝一份到高速缓存中，然后在高速缓中运算完毕后重写到主存中。
     * 在单线程中，这种方式不会导致结果异常。但是在多线程中可能就会产生问题：
     * 比如CPU有两个核，且有线程1和线程2分别在两个核上同时执行 i = i + 1;(i初始值为0)这个指令
     * 那么其执行的逻辑有可能是：CPU1，CPU2分别读取主存上i的值保存到自己的高速缓存中，那么当前两个CPU中高速缓存的值i = 0，那么都进行i + 1操作后，两个CPU再分别将运算的值写入到主存中，那么结果i实际上就不是2，而是1
     * 为了避免这种情况的产生，有从硬件层面上给总线加锁；也有缓存一致性协议（当CPU写数据时，如果发现变量时共享变量，也就是其他CPU也存在这个变量的副本，那么会通知其他CPU将对应变量的缓存行置为无效状态，因此其他CPU读取这个变量时，发现该缓存行中的变量是无效的，就会重新从主存中读取最新的数据）
     * java的内存模型也类似上诉情况。
     * java中规定所有变量都在主存当中，每个线程都有自己的工作内存，线程对所有变量的操作只能再自己的工作线程中进行，而不能直接操作主存。并且每个线程不能访问其他线程的工作内存。
     * volatile的作用就类似与上面的缓存一致性协议。
     * 被volatile修饰的变量在多线程的情况下有以下情况：
     *  1. 修改的变量会立即强制将修改的值写入主存中
     *  2. 会对其他线程的工作内存中对应的变量副本设置为无效
     *  3. 当其他线程要读取变量时，发现变量是无效状态，因此会从主存中重新读取最新的值
     * 这样就保证了多线程情况下，变量的可见性（也就是一个线程改变了值，另一个线程能立即看到修改后的值）
     */
    private static volatile Singleton instance;

    // 3. 编写getInstance静态方法, 返回单例对象
    public static Singleton getInstance() {

        // 当使用到该实例时，才创建该实例（线程安全写法，双重检查）
        if(instance == null){ // 第一次检查，判断实例为空进行初始化操作
            synchronized (Singleton.class) {
                // 使用同步代码块进行加锁
                if(instance == null){ // 第二次检查，避免获取到的锁是上一个线程释放的锁：检查的原因是：避免是其他先获取到锁的线程已经创建好了实例释放锁后，当前线程再获取到锁进行初始化操作导致产生多个实例的情况
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }

    // 错误的示例，使用同步代码块，只是对instance == null 判断检查了一次。一样会导致线程不安全情况。实际开发不能使用
//    public static Singleton getInstance() {
//        // 使用同步代码块进行加锁
//        if(instance == null){
//            synchronized (Singleton.class) {
//                instance = new Singleton();
//            }
//        }
//
//        return instance;
//    }

}
