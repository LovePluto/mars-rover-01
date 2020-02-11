package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.Rovers;

public class TurnCommand implements Command {

    private String direction;

    public TurnCommand(String direction) {
        this.direction = direction;
    }

    @Override
    public Rovers execute(Rovers rovers) {
        rovers.turnTo(this.direction);
        return rovers;
    }


}
