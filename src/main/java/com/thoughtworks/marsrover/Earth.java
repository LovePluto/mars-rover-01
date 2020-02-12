package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.command.Command;

import java.util.List;

public class Earth {

    private Rovers rovers;

    private List<Command>commands;

    public Earth(Rovers rovers) {
        this.rovers = rovers;
    }

    public void sendCommand() {
        rovers.acceptCommand(commands);
    }
}
