package com.ImageProcessing.Observer;

import com.ImageProcessing.SingletonPattern.Logger;

public class LoggerObserver implements Observer {
    @Override
    public void update(String status) {
        Logger.getInstance().log("Logger Observer: " + status);
    }
}
