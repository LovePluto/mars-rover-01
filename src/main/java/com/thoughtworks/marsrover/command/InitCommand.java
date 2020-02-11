package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.Rovers;

public class InitCommand implements Command {

    private int x;
    private int y;
    private String direction;

    public InitCommand(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        this.direction = direction;
    }

    @Override
    public Rovers execute(Rovers rovers) {
        rovers.init(this.x, this.y, this.direction);
        return rovers;
    }
}
