package com.ImageProcessing.Factory;

import com.ImageProcessing.Adapter.backgroundRemove.BackgroundRemovalService;
import com.ImageProcessing.Command.*;
import com.ImageProcessing.Decorator.ImageProcessingOperation;
import com.ImageProcessing.Strategy.AWSS3StorageStrategy;
import com.ImageProcessing.Strategy.CloudStorageContext;
import com.ImageProcessing.Strategy.GoogleDriveStorageStrategy;

public class CommandFactory {
        public Command createCommand(String type) {
            switch (type) {
                case "resize":
                    return new ResizeCommand(800, 900, "image.jpg");
                case "extend":
//                    return new AIExtentionCommand("left", 50, "image.jpg", new ImageProcessingOperation());
                case "crop":
                    return new CropCommand(5, 4, 5, 4 , "image.jpg");

                case "objectRecognisation":
                    return new ObjectRecognisation("image.jpg");

                case "bgRemove":
//                    return new RemoveBgCommand("image.jpg", new BackgroundRemovalService() {
//                        @Override
//                        public void removeBackground(String imagePath) {
//                            System.out.println(imagePath);
//                        }
//                    });
                default:
                    throw new IllegalArgumentException("Unknown command type: " + type);
            }
        }
}
