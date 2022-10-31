package designpattern.mediator.components;

import designpattern.mediator.mediator.Mediator;
import designpattern.mediator.mediator.Note;

import javax.swing.*;
import java.awt.event.ActionEvent;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:06
 * @Description:
 * Concrete components don't talk with each other. They have only one
 * communication channel–sending requests to the mediator.
 */
public class AddButton extends JButton implements Component {
    private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent event) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
}
