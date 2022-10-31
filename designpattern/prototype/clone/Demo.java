package designpattern.prototype.clone;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:54
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal("1", "老虎");
        Animal animal1 = animal.clone();
        Animal animal2 = animal.clone();
        Animal animal3 = animal.clone();
        Animal animal4 = animal.clone();
        System.out.println(animal);
        System.out.println(animal1);
        System.out.println(animal2);
        System.out.println(animal3);
        System.out.println(animal4);
        System.out.println(animal == animal1);

        System.out.println("=================================");
        Animal friend = new Animal("99", "朋友");
        animal = new Animal("1", "老鼠");
        animal.setFriend(friend);
        animal1 = animal.clone();
        // 由于是浅克隆的关系，对于引用属性来说，只是引用的传递，而不是new 一个引用属性
        System.out.println(animal + ", friend: " + animal.getFriend().hashCode());
        System.out.println(animal1 + ", friend: " + animal1.getFriend().hashCode());
        System.out.println(animal.getFriend() == animal1.getFriend());
    }
}
