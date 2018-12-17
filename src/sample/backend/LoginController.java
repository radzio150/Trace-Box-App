package sample.backend;

import javafx.beans.property.StringProperty;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class LoginController {
    @FXML private static Label ScanningStationID;
    @FXML private static Label ScanningUserID;

        @FXML public static void checkInput(int input){
        //hibernate control . send to db and compare
        //if true

            //ScanningStationID.getStyleClass().add("fx-viability: hidden");
            System.out.println(" This is my input in controller class: " + input);
            //System.out.println(ScanningStationID.getText());
        }

}
