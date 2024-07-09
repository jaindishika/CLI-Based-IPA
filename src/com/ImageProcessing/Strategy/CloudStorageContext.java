package com.ImageProcessing.Strategy;

public class CloudStorageContext {
    private CloudStorageStrategy strategy;

    public void setStrategy(CloudStorageStrategy strategy) {
        this.strategy = strategy;
    }

    public void storeFile(String path, String content) {
        if (strategy != null) {
            strategy.storeFile(path, content);
        } else {
            throw new IllegalStateException("CloudStorageStrategy not set");
        }
    }
}
