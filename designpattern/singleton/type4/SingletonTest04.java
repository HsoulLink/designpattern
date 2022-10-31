package designpattern.singleton.type4;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式04
 * 实际开发中也不推荐使用该方法
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 懒汉式（线程安全）
// 解决了线程不安全的问题。但是由于getInstance方法添加了synchronized修饰符，导致每次获取实例会进行加锁操作，这样效率就是不很高
class Singleton {

    // 1. 构造方法私有化，避免出现new的情况
    private Singleton(){

    }

    // 2. 内部声明一个静态实例
    private static Singleton instance;

    // 3. 编写getInstance静态方法, 返回单例对象。添加synchronized修饰getInstance方法，保证了线程安全
    public static synchronized Singleton getInstance() {
        // 当使用到该实例时，才创建该实例
        if(instance == null){
            instance = new Singleton();
        }

        return instance;
    }

}
