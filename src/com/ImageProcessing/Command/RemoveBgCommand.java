package com.ImageProcessing.Command;

import com.ImageProcessing.Adapter.backgroundRemove.BackgroundRemovalService;
import com.ImageProcessing.SingletonPattern.Logger;

public class RemoveBgCommand implements Command{
    private final String imagePath;
    private final BackgroundRemovalService backgroundRemovalService;

    public RemoveBgCommand(String imagePath, BackgroundRemovalService backgroundRemovalService) {
        this.imagePath = imagePath;
        this.backgroundRemovalService = backgroundRemovalService;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Background Removal operation: ImagePath = " + imagePath);
        backgroundRemovalService.removeBackground(imagePath);
        System.out.println("Background Removal operation completed for ImagePath = " + imagePath);
    }
}
