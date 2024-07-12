package com.ImageProcessing.Adapter.AIExtension;

import com.ImageProcessing.SingletonPattern.Logger;

public class ProviderExtention{
    public void ImplementMethod(String imagePath, String direction, int pixels) {
        Logger.getInstance().log("Provider A: Extending image at " + imagePath + " towards " + direction + " by " + pixels + " pixels.");
    }

}
