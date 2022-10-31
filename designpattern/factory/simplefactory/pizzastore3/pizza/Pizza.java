package designpattern.factory.simplefactory.pizzastore3.pizza;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 15:04
 * @Description: 所有披萨的基类
 */
public abstract class Pizza {
    // 名称
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    // 这里规定，每个不同披萨的准备过程都不一样，因此设定该方法为抽象方法，由具体子类进行实现
    public abstract void prepare();

    public void bake() {
        System.out.println(this.name + " 烘烤~");
    }

    public void cut() {
        System.out.println(this.name + " 切割~");
    }

    public void box() {
        System.out.println(this.name + " 打包~");
    }
}
