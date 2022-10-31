package designpattern.prototype.deepclone;


/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:54
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        Animal friend = new Animal("99", "朋友");
        Animal animal = new Animal("1", "老鼠");
        animal.setFriend(friend);
        // 深克隆1
//        Animal animal1 = animal.clone();
        // 深克隆2
        Animal animal1 = animal.clone2();
        System.out.println(animal + ", friend: " + animal.getFriend().hashCode());
        System.out.println(animal1 + ", friend: " + animal1.getFriend().hashCode());
        System.out.println(animal.getFriend() == animal1.getFriend());
    }
}
