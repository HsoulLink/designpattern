package designpattern.memento.commands;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 22:38
 * @Description: 基础命令类
 */
public interface Command {
    String getName();
    void execute();
}
