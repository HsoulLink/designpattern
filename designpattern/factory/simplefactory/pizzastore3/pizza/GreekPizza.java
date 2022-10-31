package designpattern.factory.simplefactory.pizzastore3.pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:09
 * @Description:
 */
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        setName("希腊披萨");
        System.out.println("希腊披萨 准备材料~");
    }
}
