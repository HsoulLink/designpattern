package designpattern.observer;

import designpattern.observer.editor.Editor;
import designpattern.observer.listeners.EmailNotificationListener;
import designpattern.observer.listeners.LogOpenListener;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 10:04
 * @Description: 客户端
 */
public class Demo {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
