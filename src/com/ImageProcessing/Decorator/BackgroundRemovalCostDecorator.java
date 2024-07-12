package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class BackgroundRemovalCostDecorator extends CostDecorator {
    public BackgroundRemovalCostDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public double cost() {
        return operation.cost() + 0.07; // Example additional cost for Background Removal
    }

    @Override
    public void totalCost(double amount) {
        Logger.getInstance().log("The total cost including Backgroud Removal of image is : "+ amount);
    }
}
