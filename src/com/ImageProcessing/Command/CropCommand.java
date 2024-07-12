package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;

public class CropCommand implements Command{
    private final int top;
    private final int right;
    private final int bottom;
    private final int left;
    private final String imagePath;
    private final OperationCommand command;

    public CropCommand(int top, int right, int bottom, int left, String imagePath) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
        this.imagePath = imagePath;
        this.command = new OperationCommand();
    }

    @Override
    public void execute() {
        command.CropPhoto(top, right, bottom, left, imagePath);
    }
}
