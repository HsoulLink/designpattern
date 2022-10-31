package designpattern.memento.editor;

import designpattern.memento.commands.Command;
import designpattern.memento.history.History;
import designpattern.memento.history.Memento;
import designpattern.memento.shapes.CompoundShape;
import designpattern.memento.shapes.Shape;

import javax.swing.*;
import java.io.*;
import java.util.Base64;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 22:28
 * @Description: 编辑器代码
 */
public class Editor extends JComponent {
    private Canvas canvas;
    private CompoundShape allShapes = new CompoundShape();
    private History history;

    public Editor() {
        canvas = new Canvas(this);
        history = new History();
    }

    public void loadShapes(Shape... shapes){
        allShapes.clear();
        allShapes.add(shapes);
        canvas.refresh();
    }

    public CompoundShape getShapes() {
        return allShapes;
    }

    public void execute(Command c) {
        history.push(c, new Memento(this));
        c.execute();
    }

    public void undo(){
        if(history.undo()){
            canvas.repaint();
        }
    }

    public void redo(){
        if(history.redo()){
            canvas.repaint();
        }
    }

    public String backup(){
        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);
            oos.writeObject(this.allShapes);
            oos.close();
            return Base64.getEncoder().encodeToString(baos.toByteArray());
        } catch(IOException e) {
            return "";
        }
    }

    public void restore(String state) {
        try {
            byte[] data = Base64.getDecoder().decode(state);
            ObjectInputStream ois = new ObjectInputStream(new ByteArrayInputStream(data));
            this.allShapes = (CompoundShape) ois.readObject();
            ois.close();
        } catch (IOException e) {
            System.out.print("IOException occurred.");
        } catch (ClassNotFoundException e) {
            System.out.print("ClassNotFoundException occurred.");
        }

    }
}
