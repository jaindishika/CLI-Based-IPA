package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class AIExtensionCostDecorator extends CostDecorator {
    public AIExtensionCostDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public double cost() {
        return operation.cost() + 0.10;
    }

    @Override
    public void totalCost(double amount) {
        Logger.getInstance().log("The total cost including AIExrension of image is : "+ amount);
    }
}

