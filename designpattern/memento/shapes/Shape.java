package designpattern.memento.shapes;

import java.awt.*;
import java.io.Serializable;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 22:07
 * @Description: 通用形状接口
 */
public interface Shape extends Serializable {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void drag();
    void drop();
    void moveTo(int x, int y);
    void moveBy(int x, int y);
    boolean isInsideBounds(int x, int y);
    Color getColor();
    void setColor(Color color);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
