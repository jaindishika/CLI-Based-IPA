package com.ImageProcessing.Factory;

import com.ImageProcessing.Adapter.AIExtension.ProviderExtention;
import com.ImageProcessing.Adapter.AIExtension.ProviderExtentionAdapter;
import com.ImageProcessing.Adapter.backgroundRemove.Provider;
import com.ImageProcessing.Adapter.backgroundRemove.ProviderAdapter;
import com.ImageProcessing.Adapter.payment.Gpay;
import com.ImageProcessing.Adapter.payment.GpayAdapter;
import com.ImageProcessing.Adapter.payment.Paytm;
import com.ImageProcessing.Adapter.payment.PaytmAdapter;
import com.ImageProcessing.Command.*;
import com.ImageProcessing.Strategy.AWSS3StorageStrategy;
import com.ImageProcessing.Strategy.GoogleDriveStorageStrategy;

public class CommandFactory {
        public Command createCommand(String type) {
            switch (type) {
                case "resize":
                    return new ResizeCommand(800, 900, "image.jpg");
                case "extend":
                    return new AIExtentionCommand("left", 50, "image.jpg", new ProviderExtentionAdapter(new ProviderExtention()));
                case "crop":
                    return new CropCommand(5, 4, 5, 4 , "image.jpg");
                case "objectRecognisation":
                    return new ObjectRecognisation("image.jpg");
                case "gDrive":
                    return new StoreCommand(new GoogleDriveStorageStrategy());
                case "aws":
                    return new StoreCommand(new AWSS3StorageStrategy());
                case "bgRemove":
                    return new RemoveBgCommand("image.jpg", new ProviderAdapter(new Provider()));
                case "gpay":
                    return new PaymentCommand(new GpayAdapter(new Gpay()));
                case "paytm":
                    return new PaymentCommand(new PaytmAdapter(new Paytm()));
                default:
                    throw new IllegalArgumentException("Unknown command type: " + type);
            }
        }
}
