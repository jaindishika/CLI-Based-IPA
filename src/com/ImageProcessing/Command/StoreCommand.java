package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;
import com.ImageProcessing.Strategy.CloudStorageContext;

public class StoreCommand implements Command {
    private String path;
    private String imagePath;
    private CloudStorageContext storageContext;

    public StoreCommand(String path, String imagePath, CloudStorageContext storageContext) {
        this.path = path;
        this.imagePath = imagePath;
        this.storageContext = storageContext;
    }

    @Override
    public void execute() {
        Logger.getInstance().log("Storing result to cloud: Path = " + path + ", ImagePath = " + imagePath);
        storageContext.storeFile(path, "Dummy Content"); // Simulate storing file
        System.out.println("Result stored to cloud: Path = " + path + ", ImagePath = " + imagePath);
    }
}
