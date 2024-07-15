package com.ImageProcessing.Composite;

import com.ImageProcessing.Command.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command{
    List<Command> commands = new ArrayList<>();

    public void addCommand(Command command) {
        commands.add(command);
    }

    @Override
    public void execute() {
        commands.forEach(Command::execute);
    }
}
