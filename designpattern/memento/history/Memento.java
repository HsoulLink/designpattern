package designpattern.memento.history;

import designpattern.memento.editor.Editor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 22:36
 * @Description: 备忘录类
 */
public class Memento {
    private String backup;
    private Editor editor;

    public Memento(Editor editor) {
        this.editor = editor;
        this.backup = editor.backup();
    }

    public void restore(){
        editor.restore(backup);
    }
}
