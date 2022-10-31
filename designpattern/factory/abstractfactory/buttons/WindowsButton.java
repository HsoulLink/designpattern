package designpattern.factory.abstractfactory.buttons;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:14
 * @Description:
 */
public class WindowsButton implements Button {
    @Override
    public void pain() {
        System.out.println("you have created WindowsButton");
    }
}
