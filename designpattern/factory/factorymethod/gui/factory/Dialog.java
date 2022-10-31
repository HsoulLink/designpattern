package designpattern.factory.factorymethod.gui.factory;

import designpattern.factory.factorymethod.gui.buttons.Button;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 17:05
 * @Description: 使用 工厂方法模式 实现跨平台的GUI展示
 */
public abstract class Dialog {

    public void render(){
        Button button = createButton();
        button.render();
        button.onClick();
    }

    // 声明抽象方法，将具体的实现延后到具体的子类上
    public abstract Button createButton();
}
