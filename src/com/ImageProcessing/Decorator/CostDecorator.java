package com.ImageProcessing.Decorator;

public abstract class CostDecorator implements ImageProcessingOperation {
    protected ImageProcessingOperation operation;

    public CostDecorator(ImageProcessingOperation operation) {
        this.operation = operation;
    }

    @Override
    public void execute() {
        operation.execute();
    }

    @Override
    public double getCost() {
        return operation.getCost();
    }
}
