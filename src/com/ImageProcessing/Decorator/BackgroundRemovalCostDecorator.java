package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class BackgroundRemovalCostDecorator extends CostDecorator {
    public BackgroundRemovalCostDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public void execute() {
        super.execute();
        Logger.getInstance().log("Additional cost for Background Removal added.");
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.07; // Example additional cost for Background Removal
    }
}
