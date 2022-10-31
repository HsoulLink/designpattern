package designpattern.prototype.shapes;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 20:34
 * @Description: 简单形状(圆形)
 */
public class Circle extends Shape {

    public int radius;

    public Circle(){}

    public Circle(Circle target) {
        super(target);
        if(target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Circle) || !super.equals(obj)){
            return false;
        }

        Circle circle2 = (Circle) obj;
        return circle2.radius == radius;
    }
}
