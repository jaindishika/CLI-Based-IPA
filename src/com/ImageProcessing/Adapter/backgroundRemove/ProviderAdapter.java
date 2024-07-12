package com.ImageProcessing.Adapter.backgroundRemove;

import com.ImageProcessing.SingletonPattern.Logger;

public class ProviderAdapter implements BackgroundRemovalService{
    private Provider provider;

    public ProviderAdapter(Provider provider) {
        this.provider = provider;
    }

    @Override
    public void removeBackground(String imagePath) {
        provider.removeBackground(imagePath);
//        Logger.getInstance().log("Background removal using Provider A is completed for imagePath: " + imagePath);
    }
}
