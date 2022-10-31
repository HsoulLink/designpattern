package designpattern.factory.abstractfactory.app;

import designpattern.factory.abstractfactory.factories.GUIFactory;
import designpattern.factory.abstractfactory.factories.MacOSFactory;
import designpattern.factory.abstractfactory.factories.WindowsFactory;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:22
 * @Description: 程序配置类
 */
public class Demo {
    private static Application configureApplication() {
        Application application;
        GUIFactory factory;

        // 根据本机系统类型获取对应的生成工厂
        String osName = System.getProperty("os.name").toLowerCase();
        if(osName.contains("mac")){
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }

        application = new Application(factory);
        return application;
    }

    public static void main(String[] args) {
        Application application = configureApplication();
        application.pain();
    }
}
