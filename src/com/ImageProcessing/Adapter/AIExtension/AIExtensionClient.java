package com.ImageProcessing.Adapter.AIExtension;

public class AIExtensionClient {
    private AIExtensionService service;

    public void setService(AIExtensionService service) {
        this.service = service;
    }

    public void extendImage(String imagePath, String direction, int pixels) {
        service.extendImage(imagePath, direction, pixels);
    }
}
