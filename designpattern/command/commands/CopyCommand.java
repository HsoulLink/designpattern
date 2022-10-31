package designpattern.command.commands;

import designpattern.command.editor.Editor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 10:01
 * @Description: 将所选文字复制到剪贴板
 */
public class CopyCommand extends Command {
    public CopyCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        editor.clipboard = editor.textField.getSelectedText();
        return false;
    }
}
