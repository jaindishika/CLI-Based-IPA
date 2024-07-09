import com.ImageProcessing.Command.Command;
import com.ImageProcessing.Factory.CommandFactory;
import com.ImageProcessing.Observer.ImageProcessingContext;
import com.ImageProcessing.Observer.Subject;


public class Main {
    public static void main(String[] args) {
        CommandFactory commandFactory = new CommandFactory();

//        Resize Image
        Command resize = commandFactory.createCommand("resize");
        resize.execute();

//        AI Driven Extension
//        Command extend = commandFactory.createCommand("extend");
//        extend.execute();

//        Crop Image
        Command crop = commandFactory.createCommand("crop");
        crop.execute();

//        Object Recognisation
        Command objectRecognisation = commandFactory.createCommand("objectRecognisation");
        objectRecognisation.execute();

//        Background Removal
//        Command bgRemove = commandFactory.createCommand("bgRemove");
//        bgRemove.execute();

//        Store result in google drive
//        Command gDrive = commandFactory.createCommand("gDrive");
//        gDrive.execute();

//        Store result in AWS S3
//        Command aws = commandFactory.createCommand("AWS");
//        aws.execute();

    }
}