package designpattern.factory.factorymethod.gui.factory;

import designpattern.factory.factorymethod.gui.buttons.Button;
import designpattern.factory.factorymethod.gui.buttons.WindowsButton;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 17:09
 * @Description:
 */
public class WindowsDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
