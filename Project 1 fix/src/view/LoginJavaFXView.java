package view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import model.User;
import model.UserDB;
import model.UserIO;
import java.io.IOException;
import java.util.ArrayList;

public class LoginJavaFXView extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        loadUserDB();
        Parent loginView = FXMLLoader.load(getClass().getResource("LoginJavaFX.fxml"));
        primaryStage.setTitle("Login Page");
        primaryStage.setScene(new Scene(loginView, 350, 250));
        primaryStage.show();
    }

    public void loadUserDB() {
        try {
            UserDB.setUsers((ArrayList<User>)UserIO.readUsers());
        } catch (IOException e) {
            System.err.print("Fail to open/read UserDB.dat file.");
        } catch (ClassNotFoundException e) {
            System.err.print("Fail reading and casting the UserDB due to user class issue.");
        }
    }



    public static void main(String[] args) {
        launch(args);
    }
}
