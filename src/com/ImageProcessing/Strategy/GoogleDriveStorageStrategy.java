package com.ImageProcessing.Strategy;

import com.ImageProcessing.SingletonPattern.Logger;

public class GoogleDriveStorageStrategy implements CloudStorageStrategy {
    @Override
    public void storeFile(String path) {
        // Simulate storing file to Google Drive
        Logger.getInstance().log("Storing file to Google Drive at path: " + path);
    }
}
