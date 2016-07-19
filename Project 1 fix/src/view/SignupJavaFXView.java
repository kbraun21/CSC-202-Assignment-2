package view;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * Created by kristab21 on 6/29/16.
 */
public class SignupJavaFXView {
    private static Stage signupStage = new Stage();

    public SignupJavaFXView() throws IOException {
        Stage signupStage = new Stage();
        Parent signupView = FXMLLoader.load(getClass().getResource("SignupJavaFX.fxml"));
        signupStage.setTitle("Signup Page");
        signupStage.setScene(new Scene(signupView, 700, 500));
        signupStage.show();
    }

    public static Stage getSignupStage() {
        return signupStage;
    }

}




