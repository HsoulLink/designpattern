package designpattern.observer.listeners;

import java.io.File;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 09:47
 * @Description: 通用观察者接口
 */
public interface EventListener {
    void update(String eventType, File file);
}
