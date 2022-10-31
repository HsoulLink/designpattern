package designpattern.factory.factorymethod.gui;

import designpattern.factory.factorymethod.gui.factory.Dialog;
import designpattern.factory.factorymethod.gui.factory.WindowsDialog;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 17:15
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        Dialog dialog = new WindowsDialog();
        dialog.render();
    }
}
