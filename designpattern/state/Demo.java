package designpattern.state;

import designpattern.state.ui.Player;
import designpattern.state.ui.UI;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 10:30
 * @Description: 客户端
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
