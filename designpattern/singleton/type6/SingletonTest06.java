package designpattern.singleton.type6;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式06
 */
public class SingletonTest06 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 静态内部类（线程安全）
/**
 *  静态内部类的特点：
 *      1. 当父类被装载的时候，静态内部类是不会装载
 *      2. 只有在使用到静态内部类的时候，静态内部类才会被装载。同时在类被装载的时候线程是安全的
 */
class Singleton {
    // 1. 构造方法私有化
    private Singleton() {}

    // 2. 声明静态内部类, 静态内部类中有一个静态属性
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }

    // 提供公有方法，返回SingletonInstance.INSTANCE
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}
