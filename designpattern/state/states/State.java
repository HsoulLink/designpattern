package designpattern.state.states;

import designpattern.state.ui.Player;

/**
 * @Auther: Soul_
 * @Date: 2022/10/27 10:08
 * @Description: 通用状态接口
 */
public abstract class State {
    Player player;

    /**
     * Context passes itself through the state constructor. This may help a
     * state to fetch some useful context data if needed.
     */
    State(Player player) {
        this.player = player;
    }

    public abstract String onLock();
    public abstract String onPlay();
    public abstract String onNext();
    public abstract String onPrevious();

}
