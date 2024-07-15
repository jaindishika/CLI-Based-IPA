import com.ImageProcessing.Command.Command;
import com.ImageProcessing.Decorator.*;
import com.ImageProcessing.Factory.CommandFactory;
import com.ImageProcessing.Observer.DataSource;
import com.ImageProcessing.Observer.LoggerObserver;

public class Main {
    public static void main(String[] args) {
        var dataSource = new DataSource();
        var LoggerObserver = new LoggerObserver(dataSource);
        dataSource.addObserver(LoggerObserver);
        CommandFactory commandFactory = new CommandFactory();
        ImageProcessingOperation imageProcessingOperation = new OriginalImage();

//        Resize Image
        dataSource.setMessage("Resize Operation Started");
        Command resize = commandFactory.createCommand("resize");
        resize.execute();
        ResizeOperationCostDecorator resizeOperationCostDecorator = new ResizeOperationCostDecorator(imageProcessingOperation);
        dataSource.setMessage("Resize Operation Ended");

//        AI Driven Extension
        dataSource.setMessage("Image Extention Operation Started");
        Command extend = commandFactory.createCommand("extend");
        extend.execute();
        AIExtensionCostDecorator aiExtensionCostDecorator = new AIExtensionCostDecorator(resizeOperationCostDecorator);
        dataSource.setMessage("Image Extention Operation Ended");

//        Crop Image
        dataSource.setMessage("Crop Image Operation Started");
        Command crop = commandFactory.createCommand("crop");
        crop.execute();
        CropPhotoDecorator cropPhotoDecorator = new CropPhotoDecorator(aiExtensionCostDecorator);
        dataSource.setMessage("Crop Image Operation Ended");

//        Object Recognisation
        dataSource.setMessage("Object Recognisation Operation Started");
        Command objectRecognisation = commandFactory.createCommand("objectRecognisation");
        objectRecognisation.execute();
        dataSource.setMessage("Object Recognisation Operation Ended");

//        Background Removal
        dataSource.setMessage("Background Removal Operation Started");
        Command bgRemove = commandFactory.createCommand("bgRemove");
        bgRemove.execute();
        BackgroundRemovalCostDecorator backgroundRemovalCostDecorator = new BackgroundRemovalCostDecorator(cropPhotoDecorator);
        backgroundRemovalCostDecorator.totalCost(backgroundRemovalCostDecorator.cost());
        dataSource.setMessage("Background Removal Operation Ended");

//        Command multiple operations
        Command multipleCommand = commandFactory.createCommand("multipleOperation");
        multipleCommand.execute();

//        Store result in google drive
        dataSource.setMessage("Store in google drive Operation Started");
        Command gDrive = commandFactory.createCommand("gDrive");
        gDrive.execute();

//        Gpay Payment
        dataSource.setMessage("Payment Operation Started");
        Command gpay = commandFactory.createCommand("gpay");
        gpay.execute();
        dataSource.setMessage("Payment Operation Ended");
    }
}