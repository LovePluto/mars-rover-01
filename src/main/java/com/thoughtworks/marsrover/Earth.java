package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;
import com.thoughtworks.marsrover.command.CommandFactory;

import java.util.List;

public class Earth {

    private Rovers rovers;

    private List<Command> commands;

    public Earth(Rovers rovers) {
        this.rovers = rovers;
    }

    public void createInitCommand(int x, int y, String direction) {
        commands.add(CommandFactory.createInitCommand(x, y, direction));
    }

    public void createMoveCommand(int distance) {
        commands.add(CommandFactory.createMoveCommand(distance));
    }

    public void createTurnCommond(String direction) {
        commands.add(CommandFactory.createTurnCommand(direction));
    }

    public void createRovers() {
        this.rovers = Rovers.createRovers();
    }

    public void sendCommand() {
        rovers.acceptCommand(commands);
    }
}
