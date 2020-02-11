package com.thoughtworks.marsrover.hanndler;

import com.thoughtworks.marsrover.Rovers;

public class NorthRoversHandler extends AbsRoversHandler {
    public NorthRoversHandler(Rovers rovers) {
        super(rovers);
    }

    @Override
    public void moveExecute(int distance) {
        getRovers().moveToNorth(distance);
    }

    @Override
    public void turnExecute(String direction) {
        if (LEFT.equals(direction)) {
            getRovers().setDirectionIsWest();
        }
        if (RIGHT.equals(direction)) {
            getRovers().setDirectionIsEast();
        }
    }
}
