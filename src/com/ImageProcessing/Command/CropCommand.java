package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;

public class CropCommand implements Command{
    private int top;
    private int right;
    private int bottom;
    private int left;
    private String imagePath;

    public CropCommand(int top, int right, int bottom, int left, String imagePath) {
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
}
