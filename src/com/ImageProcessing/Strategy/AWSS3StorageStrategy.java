package com.ImageProcessing.Strategy;

import com.ImageProcessing.SingletonPattern.Logger;

public class AWSS3StorageStrategy implements CloudStorageStrategy {
    @Override
    public void storeFile(String path) {
        Logger.getInstance().log("Storing file to AWS S3 bucket at path: " + path);
    }
}

