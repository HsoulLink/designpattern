package designpattern.prototype.shapes;

import java.util.Objects;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 20:32
 * @Description: 通用形状接口, 不借助java提供的Cloneable接口实现原型模式
 */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    public Shape(){}

    public Shape(Shape target) {
        if(target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Shape)) {
            return false;
        }

        Shape shape2 = (Shape) obj;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
