package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by kristab21 on 6/30/16.
 */
public class RegistrationCompleteJavaFXView {


    public RegistrationCompleteJavaFXView() throws IOException {
        Stage registrationStage = new Stage();
        Parent registrationView = FXMLLoader.load(getClass().getResource("RegistrationCompleteJavaFX.fxml"));
        registrationStage.setTitle("Registration Complete");
        registrationStage.setScene(new Scene(registrationView, 500, 300));
        registrationStage.show();
    }
}

