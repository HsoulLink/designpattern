package designpattern.factory.simplefactory.pizzastore2.order;


import designpattern.factory.simplefactory.pizzastore2.factory.PizzaFactory;
import designpattern.factory.simplefactory.pizzastore2.pizza.Pizza;

import java.util.Scanner;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:16
 * @Description: 订购披萨类
 * 引入简单工厂模式，使当前类和具体Pizza子类解耦。解决了如果有其他多个类依赖Pizza子类，当引入新的Pizza子类，所有依赖类都需要进行代码修改的问题。（Pizza子类全由简单工厂管理，Pizza子类的变动也全交给了简单工厂处理）
 */
public class OrderPizza extends PizzaFactory {
    public OrderPizza(){

        String orderType = null;
        Pizza pizza = null;
        do {
            orderType = getOrderType();
            pizza = PizzaFactory.getPizza(orderType);

            if(pizza == null){
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
