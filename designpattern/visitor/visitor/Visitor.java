package designpattern.visitor.visitor;

import designpattern.visitor.shapes.Circle;
import designpattern.visitor.shapes.CompoundShape;
import designpattern.visitor.shapes.Dot;
import designpattern.visitor.shapes.Rectangle;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 15:19
 * @Description:
 */
public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}
