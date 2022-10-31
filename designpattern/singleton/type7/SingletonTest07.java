package designpattern.singleton.type7;

/**
 * @Auther: Soul_
 * @Date: 2022/10/22 18:18
 * @Description: 单例模式07
 */
public class SingletonTest07 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance1 == instance);
        instance.sayOk();
    }
}

// 枚举实现
enum Singleton {
    INSTANCE;

    public void sayOk(){
        System.out.println("ok~");
    }
}
