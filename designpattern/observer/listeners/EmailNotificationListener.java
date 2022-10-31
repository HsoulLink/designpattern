package designpattern.observer.listeners;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 10:00
 * @Description: 收到通知后发邮件
 */
public class EmailNotificationListener implements EventListener {
    private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Email to " + email + ": Someone has performed " + eventType + " operation with the following file:" + file.getName());
    }
}
