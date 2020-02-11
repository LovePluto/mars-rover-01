package com.thoughtworks.marsrover.hanndler;

import com.thoughtworks.marsrover.Rovers;

public class EastRoversHandler extends AbsRoversHandler {

    public EastRoversHandler(Rovers rovers) {
        super(rovers);
    }

    @Override
    public void moveExecute(int distance) {
        getRovers().moveToEast(distance);
    }

    @Override
    public void turnExecute(String direction) {
        if (LEFT.equals(direction)) {
            getRovers().setDirectionIsNorth();
        }
        if (RIGHT.equals(direction)) {
            getRovers().setDirectionIsSouth();
        }
    }
}
