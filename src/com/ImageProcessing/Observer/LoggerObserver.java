package com.ImageProcessing.Observer;

import com.ImageProcessing.SingletonPattern.Logger;

public class LoggerObserver implements Observer {
    private DataSource dataSource;
    public LoggerObserver(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        Logger.getInstance().log("Logger Observer: " + dataSource.getMessage());
    }
}
