package designpattern.bridge.remotes;

import designpattern.bridge.devices.Device;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:48
 * @Description: 基础远程控制器
 */
public class BasicRemote implements Remote {
    protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Remote: pow toggle");
        if(device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Remote: volume down");
        this.device.setVolume(this.device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Remote: volume up");
        this.device.setVolume(this.device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Remote: channel down");
        this.device.setChannel(this.device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Remote: channel up");
        this.device.setChannel(this.device.getChannel() + 1);
    }
}
