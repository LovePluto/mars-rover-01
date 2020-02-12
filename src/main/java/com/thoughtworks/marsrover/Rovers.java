package com.thoughtworks.marsrover;

import com.thoughtworks.marsrover.hanndler.*;

import java.util.HashMap;
import java.util.Map;

import static com.thoughtworks.marsrover.hanndler.DirectionType.*;
import static com.thoughtworks.marsrover.hanndler.DirectionType.findByValue;

public class Rovers {
    private int x;
    private int y;
    private DirectionType direction;
    private boolean init = false;
    private Map<DirectionType, RoversHandler> map;


    public Rovers() {
        map = new HashMap<>();
        map.put(EAST, new EastRoversHandler(this));
        map.put(SOUTH, new SouthRoversHandler(this));
        map.put(WEST, new WestRoversHandler(this));
        map.put(NORTH, new NorthRoversHandler(this));
    }

    public void init(int x, int y, String direction) {
        this.x = x;
        this.y = y;
        DirectionType directionType = findByValue(direction);
        if (directionType == null) {
            throw new RuntimeException("Do not find direction by value: " + direction);
        }
        this.direction = directionType;
        init = true;

    }

    public void move(int distance) {
        checkInit();
        getHandler().moveExecute(distance);
    }


    public void turnTo(String direction) {
        checkInit();
        getHandler().turnExecute(direction);
    }

    private void checkInit() {
        if (!init) {
            throw new RuntimeException("rovers is not init!");
        }
    }

    private RoversHandler getHandler() {
        return map.get(direction);
    }

    public void setDirectionIsEast() {
        this.direction = EAST;
    }

    public void setDirectionIsSouth() {
        this.direction = SOUTH;
    }

    public void setDirectionIsWest() {
        this.direction = WEST;
    }

    public void setDirectionIsNorth() {
        this.direction = NORTH;
    }

    public void moveToEast(int distance) {
        this.x += distance;
    }

    public void moveToSouth(int distance) {
        this.y -= distance;
    }

    public void moveToWest(int distance) {
        this.x -= distance;
    }

    public void moveToNorth(int distance) {
        this.y += distance;
    }
}
