package designpattern.bridge.remotes;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:47
 * @Description: 所有远程控制器的通用接口
 */
public interface Remote {
    void power();

    void volumeDown();

    void volumeUp();

    void channelDown();

    void channelUp();
}
