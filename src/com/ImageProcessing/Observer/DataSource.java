package com.ImageProcessing.Observer;

public class DataSource extends Subject{
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyObservers();
    }

    private String message;
}
