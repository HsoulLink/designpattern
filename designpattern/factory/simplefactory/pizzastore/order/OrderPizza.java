package designpattern.factory.simplefactory.pizzastore.order;

import designpattern.factory.simplefactory.pizzastore.pizza.CheesePizza;
import designpattern.factory.simplefactory.pizzastore.pizza.GreekPizza;
import designpattern.factory.simplefactory.pizzastore.pizza.Pizza;

import java.util.Scanner;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:16
 * @Description: 订购披萨类
 */
public class OrderPizza {
    public OrderPizza(){

        String orderType = null;
        Pizza pizza = null;
        do {
            orderType = getOrderType();
            if("chesse".equals(orderType)){
                // 说明订购奶酪披萨
                pizza = new CheesePizza();
            }else if ("greek".equals(orderType)) {
                // 说明订购希腊披萨
                pizza = new GreekPizza();
            } else {
                // 没有对应的披萨类型
                System.out.println("没有对应的披萨类型~");
                // 直接退出
                break;
            }

            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);

    }

    private String getOrderType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要订购的披萨: ");
        return scanner.nextLine();
    }
}
