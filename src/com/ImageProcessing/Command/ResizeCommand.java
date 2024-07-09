package com.ImageProcessing.Command;

import com.ImageProcessing.Decorator.ImageProcessingOperation;
import com.ImageProcessing.Decorator.ResizeOperation;
import com.ImageProcessing.SingletonPattern.Logger;

public class ResizeCommand implements Command{
    private int width;
    private int height;
    private String imagePath;
    private ImageProcessingOperation operation;

    public ResizeCommand(int width, int height, String imagePath) {
        this.width = width;
        this.height = height;
        this.imagePath = imagePath;
        this.operation = new ResizeOperation(width, height, imagePath);
    }

    @Override
    public void execute() {
        operation.execute();
        double cost = operation.getCost();
        Logger.getInstance().log("Total cost for Resize operation: $" + cost);
        System.out.println("Total cost for Resize operation: $" + cost);
    }
}
