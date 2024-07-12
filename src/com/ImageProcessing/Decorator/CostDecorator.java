package com.ImageProcessing.Decorator;

public abstract class CostDecorator implements ImageProcessingOperation {
    protected ImageProcessingOperation operation;

    public CostDecorator(ImageProcessingOperation operation) {
        this.operation = operation;
    }

    @Override
    public double cost() {
        return operation.cost();
    }
    @Override
    public void totalCost(double amount) {
         operation.totalCost(amount);
    }
}
