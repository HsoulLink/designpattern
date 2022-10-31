package designpattern.mediator.components;

import designpattern.mediator.mediator.Mediator;

import javax.swing.*;
import java.awt.event.KeyEvent;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:30
 * @Description:
 */
public class TextBox extends JTextArea implements Component {
    private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent e) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "TextBox";
    }
}
