import com.ImageProcessing.Adapter.AIExtension.AIExtensionService;
import com.ImageProcessing.Adapter.AIExtension.ProviderExtention;
import com.ImageProcessing.Adapter.AIExtension.ProviderExtentionAdapter;
import com.ImageProcessing.Command.Command;
import com.ImageProcessing.Decorator.*;
import com.ImageProcessing.Factory.CommandFactory;
import com.ImageProcessing.Observer.ImageProcessingContext;
import com.ImageProcessing.Observer.Subject;


public class Main {
    public static void main(String[] args) {
        CommandFactory commandFactory = new CommandFactory();
        ImageProcessingOperation imageProcessingOperation = new OriginalImage();

//        Resize Image
        Command resize = commandFactory.createCommand("resize");
        resize.execute();
        ResizeOperationCostDecorator resizeOperationCostDecorator = new ResizeOperationCostDecorator(imageProcessingOperation);

//        AI Driven Extension
        Command extend = commandFactory.createCommand("extend");
        extend.execute();
        AIExtensionCostDecorator aiExtensionCostDecorator = new AIExtensionCostDecorator(resizeOperationCostDecorator);

//        Crop Image
        Command crop = commandFactory.createCommand("crop");
        crop.execute();
        CropPhotoDecorator cropPhotoDecorator = new CropPhotoDecorator(aiExtensionCostDecorator);

//        Object Recognisation
        Command objectRecognisation = commandFactory.createCommand("objectRecognisation");
        objectRecognisation.execute();


//        Background Removal
        Command bgRemove = commandFactory.createCommand("bgRemove");
        bgRemove.execute();
        BackgroundRemovalCostDecorator backgroundRemovalCostDecorator = new BackgroundRemovalCostDecorator(cropPhotoDecorator);
        backgroundRemovalCostDecorator.totalCost(backgroundRemovalCostDecorator.cost());

//        Store result in google drive
        Command gDrive = commandFactory.createCommand("gDrive");
        gDrive.execute();

//        Gpay Payment
        Command gpay = commandFactory.createCommand("gpay");
        gpay.execute();


    }
}