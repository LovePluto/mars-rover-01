package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.Rovers;

public class MoveCommand implements Command {

    private int distance;

    public MoveCommand(int distance) {
        this.distance = distance;
    }

    @Override
    public Rovers execute(Rovers rovers) {
        rovers.move(this.distance);
        return rovers;
    }
}
