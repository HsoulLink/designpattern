package designpattern.memento.commands;

import designpattern.memento.editor.Editor;
import designpattern.memento.shapes.Shape;

import java.awt.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 22:38
 * @Description: 修改已选形状的颜色
 */
public class ColorCommand implements Command {
    private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
}
