package designpattern.visitor.shapes;

import designpattern.visitor.visitor.Visitor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 15:19
 * @Description:
 */
public class Circle extends Dot {
    private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }

    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
