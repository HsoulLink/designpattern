package designpattern.singleton.type1;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式01
 * 在类加载的时候就会完成初始化。如果该实例没有用到的话会导致内存浪费。
 * 个人理解：不过一般实际情况上来看，引入了这个类一般都是要用到这个类的对象的。而且内存一般也足够大。通过这种方式，即能非常简单的实现单例，而且能直接避免多线程同步的问题
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 饿汉式（静态变量）
class Singleton {

    // 1. 构造方法私有化，避免出现new的情况
    private Singleton(){

    }

    // 2. 内部声明并创建一个静态实例
    private final static Singleton instance = new Singleton();

    // 3. 编写getInstance静态方法, 返回单例对象
    public static Singleton getInstance() {
        return instance;
    }

}
