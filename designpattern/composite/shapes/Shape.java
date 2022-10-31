package designpattern.composite.shapes;

import java.awt.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 18:37
 * @Description: 通用形状接口
 */
public interface Shape {
    int getX();
    int getY();
    int getWidth();
    int getHeight();
    void move(int x, int y);
    boolean isInsideBounds(int x, int y);
    void select();
    void unSelect();
    boolean isSelected();
    void paint(Graphics graphics);
}
