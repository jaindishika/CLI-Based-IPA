package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class CropOperation implements ImageProcessingOperation {
    private int top;
    private int right;
    private int bottom;
    private int left;
    private String imagePath;

    public CropOperation(int top, int right, int bottom, int left, String imagePath) {
        this.top = top;
        this.right = right;
        this.bottom = bottom;
        this.left = left;
        this.imagePath = imagePath;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Crop operation: Top = " + top + ", Right = " + right + ", Bottom = " + bottom + ", Left = " + left + ", ImagePath = " + imagePath);
        System.out.println("Crop operation completed for Top = " + top + ", Right = " + right + ", Bottom = " + bottom + ", Left = " + left + ", ImagePath = " + imagePath);
    }

    @Override
    public double getCost() {
        return 0.03; // Example cost for crop operation
    }
}
