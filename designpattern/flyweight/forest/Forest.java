package designpattern.flyweight.forest;

import designpattern.flyweight.trees.Tree;
import designpattern.flyweight.trees.TreeType;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 21:35
 * @Description: 我们绘制的森林
 */
public class Forest extends JFrame {
    private List<Tree> trees = new ArrayList<>();

    public void plantTree(int x, int y, String name, Color color, String otherTreeData) {
        TreeType type = new TreeType(name, color, otherTreeData);
        Tree tree = new Tree(x, y, type);
        trees.add(tree);
    }

    @Override
    public void paint(Graphics g){
        for (Tree tree : trees) {
            tree.draw(g);
        }
    }
}
