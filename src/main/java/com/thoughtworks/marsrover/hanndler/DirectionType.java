package com.thoughtworks.marsrover.hanndler;

public enum DirectionType {
    EAST("E"),
    SOUTH("S"),
    WEST("W"),
    NORTH("N");

    private String value;

    DirectionType(String value) {
        this.value = value;

    }

    public static DirectionType findByValue(String value) {
        for (DirectionType type : DirectionType.values()) {
            if (type.value.equals(value)) {
                return type;
            }
        }
        return null;
    }

    public String getValue() {
        return value;
    }
}
