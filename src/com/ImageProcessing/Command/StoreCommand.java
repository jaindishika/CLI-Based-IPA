package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;
import com.ImageProcessing.Strategy.CloudStorageStrategy;

public class StoreCommand implements Command {
    private CloudStorageStrategy cloudStorageStrategy;

    public StoreCommand(CloudStorageStrategy CloudStore) {
        this.cloudStorageStrategy = CloudStore;
    }

    @Override
    public void execute() {

    }
}
