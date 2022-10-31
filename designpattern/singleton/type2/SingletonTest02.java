package designpattern.singleton.type2;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式02
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1 == instance);
    }
}

// 饿汉式（静态代码块）
class Singleton {

    // 1. 构造方法私有化，避免出现new的情况
    private Singleton(){

    }

    // 2. 内部声明一个静态实例
    private final static Singleton instance;

    // 3. 使用静态代码块的方式初始化实例
    static {
        instance = new Singleton();
    }

    // 4. 编写getInstance静态方法, 返回单例对象
    public static Singleton getInstance() {
        return instance;
    }

}
