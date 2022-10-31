package designpattern.adapter.square;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:19
 * @Description: 方钉
 */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getSquare() {
        double result;
        result = Math.pow(this.width, 2);
        return result;
    }
}
