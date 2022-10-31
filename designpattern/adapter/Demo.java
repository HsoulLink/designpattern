package designpattern.adapter;

import designpattern.adapter.adapters.SquarePegAdapter;
import designpattern.adapter.round.RoundHole;
import designpattern.adapter.round.RoundPeg;
import designpattern.adapter.square.SquarePeg;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:26
 * @Description: 客户端代码
 */
public class Demo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);
        if(roundHole.fits(roundPeg)){
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);
        // hole.fits(smallSqPeg); // Won't compile.

        // Adapter solves the problem.
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if(roundHole.fits(smallSqPegAdapter)){
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if(!roundHole.fits(largeSqPegAdapter)){
            System.out.println("Square peg w20 does not fits into round hole r5.");
        }

    }
}
