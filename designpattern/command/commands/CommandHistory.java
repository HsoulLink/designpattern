package designpattern.command.commands;

import java.util.Stack;

/**
 * @Auther: Soul_
 * @Date: 2022/10/26 10:09
 * @Description: 命令历史
 */
public class CommandHistory {
    private Stack<Command> history = new Stack<>();

    public void push(Command c) {
        history.push(c);
    }

    public Command pop() {
        return history.pop();
    }

    public boolean isEmpty() {
        return history.isEmpty();
    }
}
