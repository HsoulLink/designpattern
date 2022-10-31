package designpattern.prototype.deepclone;

import java.io.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:54
 * @Description: 深克隆例子，java本身有提供克隆方式 Cloneable 接口，只要类实现了这个接口，就说明这个类有克隆自身的能力
 * 深克隆可以使引用类型的属性中的值也同样被克隆（就像新建了一个引用属性，同时内部的值都和原引用属性的值一样）
 */
public class Animal implements Cloneable, Serializable {
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

    // 方式1，是引用类型就将引用类型中的属性同样再克隆一次
    protected Animal clone() {
        try {
            Animal clone = (Animal) super.clone();
            // 再调用引用类型属性的clone方法进行克隆。也可以遍历的方式，把引用类型内的所有属性进行复制操作
            if(this.friend != null){
                Animal friend = this.friend.clone();
                clone.setFriend(friend);
            }
            return clone;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    // 方式2，使用序列化
    protected Animal clone2(){
        ObjectOutputStream oos = null;
        ObjectInputStream ois = null;
        ByteArrayOutputStream bos = null;
        ByteArrayInputStream bis = null;
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            return (Animal) ois.readObject();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if(oos != null){
                    oos.close();
                }

                if(ois != null){
                    ois.close();
                }
                // 因为ByteArrayOutputStream, ByteArrayInputStream是底层是内存中数组存储数据的，所以关不关闭无所谓
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
