package com.thoughtworks.marsrover.command;

public class CommandFactory {

    public static Command createInitCommand(int x, int y, String direction) {
        return new InitCommand(x, y, direction);
    }

    public static Command createMoveCommand(int distance) {
        return new MoveCommand(distance);
    }

    public static Command createTurnCommand(String direction) {
        return new TurnCommand(direction);
    }
}
