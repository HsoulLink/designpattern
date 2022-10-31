package designpattern.prototype.shapes;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 20:34
 * @Description: 另一个形状(矩形)
 */
public class Rectangle extends Shape {
    public int width;
    public int height;

    public Rectangle(){}

    public Rectangle(Rectangle target) {
        super(target);
        if(target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Rectangle) || !super.equals(obj)){
            return false;
        }

        Rectangle rectangle2 = (Rectangle) obj;
        return rectangle2.width == width && rectangle2.height == height;
    }
}
