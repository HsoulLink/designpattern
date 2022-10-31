package designpattern.mediator.mediator;

import designpattern.mediator.components.Component;

import javax.swing.*;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:03
 * @Description: 定义通用中介者接口
 */
public interface Mediator {
    void addNewNote(Note note);
    void deleteNote();
    void getInfoFromList(Note note);
    void saveChanges();
    void markNote();
    void clear();
    void sendToFilter(ListModel listModel);
    void setElementsList(ListModel list);
    void registerComponent(Component component);
    void hideElements(boolean flag);
    void createGUI();
}
