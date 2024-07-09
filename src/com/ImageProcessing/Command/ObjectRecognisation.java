package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;

public class ObjectRecognisation implements Command{
    private String image;

    public ObjectRecognisation(String image) {
        this.image = image;
    }
    @Override
    public void execute() {
        Logger.getInstance().log("Recognizing objects in the image");
        System.out.println("Recognizing objects in the image" + image);
    }
}
