package designpattern.adapter.round;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:17
 * @Description: 圆钉
 */
public class RoundPeg {
    private double radius;

    public RoundPeg() {}

    public RoundPeg(double radius) {
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }
}
