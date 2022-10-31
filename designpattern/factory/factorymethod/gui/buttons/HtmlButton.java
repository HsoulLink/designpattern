package designpattern.factory.factorymethod.gui.buttons;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 17:10
 * @Description:
 */
public class HtmlButton implements Button{
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
