package com.thoughtworks.marsrover.command;

import com.thoughtworks.marsrover.Rovers;

public interface Command {

    Rovers execute(Rovers rovers);
}
