package com.ImageProcessing.Command;

public class ResizeCommand implements Command{
    private int width;
    private int height;
    private String imagePath;
    private final OperationCommand command;
    public ResizeCommand(int width, int height, String imagePath) {
        this.width = width;
        this.height = height;
        this.imagePath = imagePath;
        this.command = new OperationCommand();
    }

    @Override
    public void execute() {
        command.ResizePhoto(width, height, imagePath);
    }
}
