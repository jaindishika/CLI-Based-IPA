package com.ImageProcessing.Command;

import com.ImageProcessing.Decorator.AIExtensionCostDecorator;
import com.ImageProcessing.Decorator.ImageProcessingOperation;
import com.ImageProcessing.SingletonPattern.Logger;

public class AIExtentionCommand implements Command{
    private String direction;
    private int pixels;
    private String imagePath;
    private ImageProcessingOperation operation;

    public AIExtentionCommand(String direction, int pixels, String imagePath, ImageProcessingOperation baseOperation) {
        this.direction = direction;
        this.pixels = pixels;
        this.imagePath = imagePath;
        this.operation = new AIExtensionCostDecorator(baseOperation);
    }

    @Override
    public void execute() {
        operation.execute();
        double cost = operation.getCost();
        Logger.getInstance().log("Total cost for AI Extension operation: $" + cost);
        System.out.println("Total cost for AI Extension operation: $" + cost);
    }
}
