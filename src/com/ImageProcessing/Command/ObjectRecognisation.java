package com.ImageProcessing.Command;

import com.ImageProcessing.SingletonPattern.Logger;

public class ObjectRecognisation implements Command{
    private final String image;
    private final OperationCommand command;

    public ObjectRecognisation(String image) {
        this.image = image;
        this.command = new OperationCommand();
    }
    @Override
    public void execute() {
         command.ObjectRecognisation(image);
//        Logger.getInstance().log("Recognizing objects in the image");
//        System.out.println("Recognizing objects in the image" + image);
    }
}
