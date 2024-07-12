package com.ImageProcessing.Command;

import com.ImageProcessing.Adapter.AIExtension.AIExtensionService;
import com.ImageProcessing.Adapter.AIExtension.ProviderExtention;
import com.ImageProcessing.Adapter.AIExtension.ProviderExtentionAdapter;
import com.ImageProcessing.Decorator.AIExtensionCostDecorator;
import com.ImageProcessing.Decorator.ImageProcessingOperation;
import com.ImageProcessing.SingletonPattern.Logger;

public class AIExtentionCommand implements Command{
    private String direction;
    private int pixels;
    private String imagePath;
    private AIExtensionService aiExtensionService;

    public AIExtentionCommand(String direction, int pixels, String imagePath, AIExtensionService aiExtensionService) {
        this.direction = direction;
        this.pixels = pixels;
        this.imagePath = imagePath;
        this.aiExtensionService = aiExtensionService;
    }

    @Override
    public void execute() {
        aiExtensionService.extendImage(imagePath, direction, pixels);
    }
}
