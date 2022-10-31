package designpattern.factory.simplefactory.pizzastore2.factory;

import designpattern.factory.simplefactory.pizzastore2.pizza.CheesePizza;
import designpattern.factory.simplefactory.pizzastore2.pizza.GreekPizza;
import designpattern.factory.simplefactory.pizzastore2.pizza.Pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:37
 * @Description: 简单工厂模式（也可以称为静态工厂模式：因为对应的工厂方法可以是静态方法）
 */
public class PizzaFactory {
    public static Pizza getPizza(String orderType){
        Pizza pizza = null;
        if("chesse".equals(orderType)){
            // 说明订购奶酪披萨
            pizza = new CheesePizza();
        }else if ("greek".equals(orderType)) {
            // 说明订购希腊披萨
            pizza = new GreekPizza();
        }

        return pizza;
    }
}
