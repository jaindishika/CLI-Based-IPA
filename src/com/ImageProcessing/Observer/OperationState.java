package com.ImageProcessing.Observer;

public interface OperationState {
    void execute(ImageProcessingContext context);
    double getCost();
}
