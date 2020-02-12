package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.command.CommandFactory;

import java.util.ArrayList;
import java.util.List;

public class Earth {

    private Rovers rovers;

    private List<Command> commands;

    public Earth() {
        commands = new ArrayList<>();
    }

    private void createInitCommand(int x, int y, String direction) {
        commands.add(CommandFactory.createInitCommand(x, y, direction));
    }

    private void createMoveCommand(int distance) {
        commands.add(CommandFactory.createMoveCommand(distance));
    }

    private void createTurnCommond(String direction) {
        commands.add(CommandFactory.createTurnCommand(direction));
    }

    private void createRovers() {
        this.rovers = Rovers.createRovers();
    }

    private void sendCommand() {
        rovers.acceptCommand(commands);
    }

    private void outputRoversLocation() {
        rovers.outCurrentLocation();

    }

    public void start() {
        createRovers();
        rovers.init(0, 0, "E");
        System.out.println("火星车初始化坐标为：0,0,E");
        //选择输入命令：1.移动火星车；2.火星车转向；3.重新设定火星车位置；4.发送当前累积的命令
        //逻辑就不实现了，Java控制台交互太麻烦了,简单模拟一下

        createMoveCommand(4);
        createTurnCommond("L");
        createMoveCommand(5);
        createTurnCommond("L");
        createMoveCommand(10);
        createTurnCommond("L");
        sendCommand();
        outputRoversLocation();

    }

    public static void main(String[] args) {
        new Earth().start();
    }
}
