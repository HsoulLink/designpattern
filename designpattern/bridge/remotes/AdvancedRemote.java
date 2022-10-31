package designpattern.bridge.remotes;

import designpattern.bridge.devices.Device;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:52
 * @Description: 高级远程控制器
 */
public class AdvancedRemote extends BasicRemote {
    public AdvancedRemote(Device device) {
        super(device);
    }

    public void mute(){
        System.out.println("Remote: mute");
        device.setVolume(0);
    }
}
