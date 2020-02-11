package com.thoughtworks.marsrover.hanndler;

import com.thoughtworks.marsrover.Rovers;

public class WestRoversHandler extends AbsRoversHandler {
    public WestRoversHandler(Rovers rovers) {
        super(rovers);
    }

    @Override
    public void moveExecute(int distance) {
        getRovers().moveToWest(distance);
    }

    @Override
    public void turnExecute(String direction) {
        if (LEFT.equals(direction)) {
            getRovers().setDirectionIsSouth();
        }
        if (RIGHT.equals(direction)) {
            getRovers().setDirectionIsNorth();
        }
    }
}
