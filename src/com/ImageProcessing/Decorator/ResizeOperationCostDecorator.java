package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class ResizeOperationCostDecorator extends CostDecorator {
    public ResizeOperationCostDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public double cost() {
        return operation.cost() + 0.05; // Example cost for resize operation
    }

    @Override
    public void totalCost(double amount) {
        Logger.getInstance().log("The total cost including Resize Operation of image is : "+ amount);
    }
}
