package designpattern.bridge;

import designpattern.bridge.devices.Device;
import designpattern.bridge.devices.Radio;
import designpattern.bridge.devices.Tv;
import designpattern.bridge.remotes.AdvancedRemote;
import designpattern.bridge.remotes.BasicRemote;

/**
 * @Auther: Soul_
 * @Date: 2022/10/25 15:53
 * @Description:
 */
public class Demo {
    public static void main(String[] args) {
        testDevvice(new Radio());
        testDevvice(new Tv());
    }

    public static void testDevvice(Device device){
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
