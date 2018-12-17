package sample.frontend;

import javax.swing.*;
import java.awt.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import sample.backend.Static_Constants;

import java.io.IOException;

/**
 * This class will be used to control the look of the application using Swing
 *  framework.
 */
public class SwingClass {
    public SwingClass(Stage primaryStage, Parent root){
        drawLoginPage(primaryStage, root);
    }

    public void drawLoginPage(Stage primaryStage, Parent root){
        Scene scene = new Scene(root, Static_Constants.getScreenWidth(),
                Static_Constants.getScreenHeight());

        primaryStage.alwaysOnTopProperty();
        primaryStage.setTitle(Static_Constants.getMainSceneTitle());
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
