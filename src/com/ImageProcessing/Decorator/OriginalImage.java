package com.ImageProcessing.Decorator;

import com.ImageProcessing.SingletonPattern.Logger;

public class OriginalImage implements ImageProcessingOperation{
    @Override
    public double cost() {
        return 50.00;
    }

    @Override
    public void totalCost(double amount) {
        Logger.getInstance().log("The cost of an image is : "+ amount);
    }
}
