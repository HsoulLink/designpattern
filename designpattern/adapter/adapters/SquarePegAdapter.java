package designpattern.adapter.adapters;

import designpattern.adapter.round.RoundPeg;
import designpattern.adapter.square.SquarePeg;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:22
 * @Description: 方钉到圆孔的适配器
 */
public class SquarePegAdapter extends RoundPeg {
    private SquarePeg squarePeg;

    public SquarePegAdapter(SquarePeg squarePeg) {
        this.squarePeg = squarePeg;
    }

    @Override
    public double getRadius() {
        double result;
        result = Math.sqrt(Math.pow((squarePeg.getWidth() / 2), 2) * 2);
        return result;
    }
}
