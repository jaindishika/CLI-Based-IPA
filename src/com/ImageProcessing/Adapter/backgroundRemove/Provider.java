package com.ImageProcessing.Adapter.backgroundRemove;

import com.ImageProcessing.SingletonPattern.Logger;

public class Provider {
    public void removeBackground(String imagePath) {
        Logger.getInstance().log("Provider A: Background removal for image at " + imagePath);
    }
}
