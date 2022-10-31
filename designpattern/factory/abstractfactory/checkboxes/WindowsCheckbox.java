package designpattern.factory.abstractfactory.checkboxes;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:15
 * @Description:
 */
public class WindowsCheckbox implements Checkbox{
    @Override
    public void pain() {
        System.out.println("you have created WindowsCheckbox");
    }
}
