package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by kristab21 on 6/30/16.
 */
public class WelcomeJavaFXView {

    public WelcomeJavaFXView() throws IOException {
        Stage welcomeStage = new Stage();
        Parent welcomeView = FXMLLoader.load(getClass().getResource("WelcomeJavaFX.fxml"));
        welcomeStage.setTitle("Welcome Page");
        welcomeStage.setScene(new Scene(welcomeView, 450, 250));
        welcomeStage.show();
    }
}

