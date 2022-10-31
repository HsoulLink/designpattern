package designpattern.mediator.mediator;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:27
 * @Description:
 */
public class Note {
    private String name;
    private String text;

    public Note() {
        name = "New Note";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return name;
    }
}
