package designpattern.factory.simplefactory.pizzastore3.order;


import designpattern.factory.simplefactory.pizzastore3.pizza.Pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:16
 * @Description: 订购披萨类
 *  工厂方法模式：其在父类中提供一个创建对象的方法， 允许子类决定实例化对象的类型。
 */
public abstract class OrderPizza {
    public Pizza OrderPizza(){
        return createPizza();
    }


    public abstract Pizza createPizza();
}
