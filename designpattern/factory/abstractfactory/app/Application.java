package designpattern.factory.abstractfactory.app;

import designpattern.factory.abstractfactory.buttons.Button;
import designpattern.factory.abstractfactory.checkboxes.Checkbox;
import designpattern.factory.abstractfactory.factories.GUIFactory;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:20
 * @Description: 客户端
 */
public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void pain(){
        button.pain();
        checkbox.pain();
    }
}
