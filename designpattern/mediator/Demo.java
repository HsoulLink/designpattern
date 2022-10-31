package designpattern.mediator;

import designpattern.mediator.components.*;
import designpattern.mediator.mediator.Editor;
import designpattern.mediator.mediator.Mediator;

import javax.swing.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:02
 * @Description: 客户端
 */
public class Demo {
    public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
