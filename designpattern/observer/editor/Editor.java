package designpattern.observer.editor;

import designpattern.observer.publisher.EventManager;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 09:45
 * @Description: 具体事件发布者
 */
public class Editor {
    public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath){
        this.file = new File(filePath);
        this.events.notify("open", this.file);
    }

    public void saveFile() {
        if(this.file != null){
            events.notify("save", this.file);
        } else {
            throw new RuntimeException("Please open a file first.");
        }
    }
}
