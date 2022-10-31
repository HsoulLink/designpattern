package designpattern.factory.abstractfactory.checkboxes;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:14
 * @Description:
 */
public class MacOSCheckbox implements Checkbox{
    @Override
    public void pain() {
        System.out.println("you have created MacOSCheckbox");
    }
}
