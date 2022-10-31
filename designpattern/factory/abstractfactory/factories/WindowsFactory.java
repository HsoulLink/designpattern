package designpattern.factory.abstractfactory.factories;

import designpattern.factory.abstractfactory.buttons.Button;
import designpattern.factory.abstractfactory.buttons.WindowsButton;
import designpattern.factory.abstractfactory.checkboxes.Checkbox;
import designpattern.factory.abstractfactory.checkboxes.WindowsCheckbox;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:15
 * @Description:
 */
public class WindowsFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
