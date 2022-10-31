package designpattern.command;

import designpattern.command.editor.Editor;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 09:52
 * @Description: 客户端代码
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.init();
    }
}
