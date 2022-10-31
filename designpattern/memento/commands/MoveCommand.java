package designpattern.memento.commands;

import designpattern.memento.editor.Editor;
import designpattern.memento.shapes.Shape;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 23:35
 * @Description: 移动已选形状
 */
public class MoveCommand implements Command {

    private Editor editor;
    private int startX, startY;
    private int endX, endY;

    public MoveCommand(Editor editor) {
        this.editor = editor;
    }

    @Override
    public String getName() {
        return "Move by x:" + (endX - startX) + " Y:" + (endY - startY);
    }

    public void start(int x, int y){
        startX = x;
        startY = y;
        for (Shape child : editor.getShapes().getSelected()) {
            child.drag();
        }
    }

    public void move(int x, int y) {
        for (Shape child : editor.getShapes().getSelected()) {
            child.moveTo(x - startX, y - startY);
        }
    }

    public void stop(int x, int y) {
        endX = x;
        endY = y;
        for (Shape child : editor.getShapes().getSelected()) {
            child.drop();
        }
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.moveBy(endX - startX, endY - startY);
        }
    }
}
