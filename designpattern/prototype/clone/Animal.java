package designpattern.prototype.clone;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:54
 * @Description: 浅克隆例子，java本身有提供克隆方式 Cloneable 接口，只要类实现了这个接口，就说明这个类有克隆自身的能力
 * 这种克隆方式是浅克隆的方式，对于基本数据类型是直接值进行克隆，对于属性中的引用类型只是简单的引用传递
 */
public class Animal implements Cloneable {
    private String id;
    private String name;

    private Animal friend;

    public Animal(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal getFriend() {
        return friend;
    }

    public void setFriend(Animal friend) {
        this.friend = friend;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", friend=" + friend +
                '}';
    }

    protected Animal clone() {
        try {
            return (Animal) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}
