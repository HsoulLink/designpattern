package designpattern.mediator.components;

import designpattern.mediator.mediator.Mediator;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 18:02
 * @Description: 组件通用接口
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
