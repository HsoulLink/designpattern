package designpattern.flyweight.trees;

import java.awt.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 21:27
 * @Description: 包含每颗树的独特状态
 */
public class Tree {
    private int x;
    private int y;
    private TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Graphics g) {
        type.draw(g, x, y);
    }
}
