package designpattern.factory.abstractfactory.factories;

import designpattern.factory.abstractfactory.buttons.Button;
import designpattern.factory.abstractfactory.checkboxes.Checkbox;

/**
 * @Auther: Soul_
 * @Date: 2022/10/24 18:15
 * @Description: 抽象工厂类，用于声明工厂能提供 一系列产品中 具体有那些产品
 */
public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
