package designpattern.factory.abstractfactory.factories;

import designpattern.factory.abstractfactory.buttons.Button;
import designpattern.factory.abstractfactory.buttons.MacOSButton;
import designpattern.factory.abstractfactory.checkboxes.Checkbox;
import designpattern.factory.abstractfactory.checkboxes.MacOSCheckbox;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:15
 * @Description:
 */
public class MacOSFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
