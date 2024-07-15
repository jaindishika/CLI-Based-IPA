package com.ImageProcessing.Command;

import com.ImageProcessing.Strategy.CloudStorageStrategy;

public class StoreCommand implements Command {
    private CloudStorageStrategy cloudStorageStrategy;
    private final String imagePath;
    public StoreCommand(CloudStorageStrategy CloudStore, String imagePath) {
        this.cloudStorageStrategy = CloudStore;
        this.imagePath = imagePath;
    }

    @Override
    public void execute() {
        cloudStorageStrategy.storeFile(imagePath);
    }
}
