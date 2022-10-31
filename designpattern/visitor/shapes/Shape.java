package designpattern.visitor.shapes;

import designpattern.visitor.visitor.Visitor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 15:18
 * @Description:
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
