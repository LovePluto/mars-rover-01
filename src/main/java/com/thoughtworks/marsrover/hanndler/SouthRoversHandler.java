package com.thoughtworks.marsrover.hanndler;

import com.thoughtworks.marsrover.Rovers;

public class SouthRoversHandler extends AbsRoversHandler {
    public SouthRoversHandler(Rovers rovers) {
        super(rovers);
    }

    @Override
    public void moveExecute(int distance) {
        getRovers().moveToSouth(distance);
    }

    @Override
    public void turnExecute(String direction) {
        if (LEFT.equals(direction)) {
            getRovers().setDirectionIsEast();
        }
        if (RIGHT.equals(direction)) {
            getRovers().setDirectionIsWest();
        }
    }
}
