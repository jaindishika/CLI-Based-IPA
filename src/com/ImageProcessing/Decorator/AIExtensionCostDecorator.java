package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class AIExtensionCostDecorator extends CostDecorator {
    public AIExtensionCostDecorator(ImageProcessingOperation operation) {
        super(operation);
    }

    @Override
    public void execute() {
        super.execute();
        Logger.getInstance().log("Additional cost for AI Extension added.");
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.10; // Example additional cost for AI Extension
    }
}

