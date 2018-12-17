package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import sample.backend.NfcReaderController;
import sample.backend.ScanningThread;
import sample.backend.Static_Constants;
import sample.frontend.SwingClass;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource(Static_Constants.getMainSceneFxml()));
        new SwingClass(primaryStage, root);
        ScanningThread thread = new ScanningThread();
        thread.start();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
