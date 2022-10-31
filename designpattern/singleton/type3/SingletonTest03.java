package designpattern.singleton.type3;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式03
 * 注意：实际开发中不要使用这种方式
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 懒汉式（线程不安全）
// 该写法只有当使用到该实例时才去创建该单例对象。但是有线程不安全问题(也就是可能有多个线程同时执行getInstance()方法，会创建出不同的实例对象)
// 当有两个线程同时调用getInstance()方法时，其中一个判断了 instance == null 代码后，另外一个线程也对 instance == null 进行了判断，这样的话两个线程就都走到了实例初始化的代码，就导致会产生多个实例
class Singleton {

    // 1. 构造方法私有化，避免出现new的情况
    private Singleton(){

    }

    // 2. 内部声明一个静态实例
    private static Singleton instance;

    // 3. 编写getInstance静态方法, 返回单例对象
    public static Singleton getInstance() {

        // 当使用到该实例时，才创建该实例
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
