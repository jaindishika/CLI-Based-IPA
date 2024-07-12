package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class CropPhotoDecorator extends CostDecorator {
    public CropPhotoDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public double cost() {
        return operation.cost() + 0.03; // Example cost for crop operation
    }

    @Override
    public void totalCost(double amount) {
        Logger.getInstance().log("The total cost including Cropping of image is : "+ amount);
    }
}
