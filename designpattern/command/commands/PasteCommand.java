package designpattern.command.commands;

import designpattern.command.editor.Editor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 10:02
 * @Description: 从剪贴板粘贴文字
 */
public class PasteCommand extends Command {
    public PasteCommand(Editor editor) {
        super(editor);
    }

    @Override
    public boolean execute() {
        if(editor.clipboard == null || editor.clipboard.isEmpty()) {
            return false;
        }

        backup();
        editor.textField.insert(editor.clipboard, editor.textField.getCaretPosition());
        return true;
    }
}
