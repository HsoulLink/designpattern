package designpattern.factory.abstractfactory.buttons;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:14
 * @Description:
 */
public class MacOSButton implements Button {

    @Override
    public void pain() {
        System.out.println("you have created MacOSButton");
    }
}
