package designpattern.adapter.round;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:15
 * @Description: 圆孔
 */
public class RoundHole {
    private double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public boolean fits(RoundPeg peg) {
        boolean result;
        result = this.getRadius() >= peg.getRadius();
        return result;
    }
}
