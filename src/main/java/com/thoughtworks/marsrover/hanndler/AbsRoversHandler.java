package com.thoughtworks.marsrover.hanndler;

import com.thoughtworks.marsrover.Rovers;

public abstract class AbsRoversHandler implements RoversHandler {
    private Rovers rovers;

    public static final String LEFT = "L";
    public static final String RIGHT = "R";

    public AbsRoversHandler(Rovers rovers) {
        this.rovers = rovers;
    }

    protected Rovers getRovers() {
        return rovers;
    }
}
