package designpattern.factory.simplefactory.pizzastore.pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:07
 * @Description:
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("奶酪披萨");
        System.out.println("奶酪披萨 准备材料~");
    }
}
