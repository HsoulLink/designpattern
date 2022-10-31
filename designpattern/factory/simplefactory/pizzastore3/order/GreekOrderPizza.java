package designpattern.factory.simplefactory.pizzastore3.order;

import designpattern.factory.simplefactory.pizzastore3.pizza.GreekPizza;
import designpattern.factory.simplefactory.pizzastore3.pizza.Pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 16:23
 * @Description:
 */
public class GreekOrderPizza extends OrderPizza {
    @Override
    public Pizza createPizza() {
        return new GreekPizza();
    }
}
