package com.ImageProcessing.Strategy;

import com.ImageProcessing.SingletonPattern.Logger;

public class GoogleDriveStorageStrategy implements CloudStorageStrategy {
    @Override
    public void storeFile(String path, String content) {
        // Simulate storing file to Google Drive
        Logger.getInstance().log("Storing file to Google Drive at path: " + path);
    }
}
