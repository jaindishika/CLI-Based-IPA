package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class ResizeOperation implements ImageProcessingOperation {
    private int width;
    private int height;
    private String imagePath;

    public ResizeOperation(int width, int height, String imagePath) {
        this.width = width;
        this.height = height;
        this.imagePath = imagePath;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Resize operation: Width = " + width + ", Height = " + height + ", ImagePath = " + imagePath);
        System.out.println("Resize operation completed for Width = " + width + ", Height = " + height + ", ImagePath = " + imagePath);
    }

    @Override
    public double getCost() {
        return 0.05; // Example cost for resize operation
    }
}
