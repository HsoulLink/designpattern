package designpattern.factory.simplefactory.pizzastore3.order;

import designpattern.factory.simplefactory.pizzastore3.pizza.Pizza;

import java.util.Scanner;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:21
 * @Description:
 */
public class PizzaStore {
    public static void main(String[] args) {
        String orderType = null;
        OrderPizza orderPizza = null;
        Pizza pizza = null;
        do {
            orderPizza = null;

            orderType = getOrderType();
            if("chesse".equals(orderType)){
                orderPizza = new CheeseOrderPizza();
            } else if("greek".equals(orderType)) {
                orderPizza = new GreekOrderPizza();
            }

            if(orderPizza == null){
                // 没有对应的披萨类型
                System.out.println("没有对应的披萨类型~");
                // 直接退出
                break;
            }

            pizza = orderPizza.createPizza();
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }while(true);
    }

    private static String getOrderType(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入需要订购的披萨: ");
        return scanner.nextLine();
    }

}
