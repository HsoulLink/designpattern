package designpattern.command.commands;

import designpattern.command.editor.Editor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 09:52
 * @Description: 抽象基础命令
 */
public abstract class Command {
    public Editor editor;
    private String backup;

    Command(Editor editor) {
        this.editor = editor;
    }

    void backup(){
        backup = editor.textField.getText();
    }

    public void undo(){
        editor.textField.setText(backup);
    }

    public abstract boolean execute();
}
