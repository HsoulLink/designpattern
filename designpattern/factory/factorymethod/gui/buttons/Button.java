package designpattern.factory.factorymethod.gui.buttons;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 17:06
 * @Description: 按钮接口
 */
public interface Button {
    // 渲染方法
    void render();

    // 点击事件
    void onClick();
}
