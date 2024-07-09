package com.ImageProcessing.Adapter.backgroundRemove;

public class BackgroundRemovalClient {
    private BackgroundRemovalService service;

    public void setService(BackgroundRemovalService service) {
        this.service = service;
    }

    public void removeBackground(String imagePath) {
        service.removeBackground(imagePath);
    }
}
