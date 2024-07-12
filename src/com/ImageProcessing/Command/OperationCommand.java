package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;

public class OperationCommand {
    public void CropPhoto(int top, int right, int bottom, int left, String imagePath){
        Logger.getInstance().log("Crop operation: Top = " + top + ", Right = " + right + ", Bottom = " + bottom + ", Left = " + left + ", ImagePath = " + imagePath);
    }
    public void ResizePhoto(int width, int height, String imagePath){
        Logger.getInstance().log("Resize operation: Width = " + width + ", Height = " + height + ", ImagePath = " + imagePath);
    }
    public void ObjectRecognisation(String imagePath){
        Logger.getInstance().log("Object Recognisation of Image = " + imagePath);
    }
}
