package com.ImageProcessing.Adapter.AIExtension;

import com.ImageProcessing.SingletonPattern.Logger;

public class ProviderExtentionAdapter implements AIExtensionService {
    private ProviderExtention providerExtension;

    public ProviderExtentionAdapter(ProviderExtention providerExtension) {
        this.providerExtension = providerExtension;
    }
    @Override
    public void extendImage(String imagePath, String direction, int pixels) {
        providerExtension.ImplementMethod(imagePath, direction, pixels);
//        Logger.getInstance().log("AI-driven extension using Provider A is completed for imagePath: " + imagePath + ", direction: " + direction + ", pixels: " + pixels);
    }
}
