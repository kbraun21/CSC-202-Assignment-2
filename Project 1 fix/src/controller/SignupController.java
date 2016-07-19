package controller;


import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.FileChooser;
import model.User;
import model.UserDB;
import model.UserIO;
import view.RegistrationCompleteJavaFXView;
import javafx.stage.FileChooser.ExtensionFilter;
import view.SignupJavaFXView;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by kristab21 on 6/29/16.
 */

public class SignupController {

    @FXML
    TextField uname;
    @FXML
    PasswordField pw;
    @FXML
    PasswordField confirmpw;
    @FXML
    TextField email;
    @FXML
    TextField firstName;
    @FXML
    TextField lastName;
    @FXML
    TextField dob;
    @FXML
    TextField gender;
    @FXML
    TextField ssn;
    @FXML
    TextField phoneNumber;
    @FXML
    TextField photoFile;
    @FXML
    Label failSamePassword;
    @FXML
    Label failEmailFormat;
    @FXML
    Label failFieldsNotComplete;
    @FXML
    Label failPasswordFormat;
    @FXML
    Label failUsernameExists;
    @FXML
    ArrayList users;


    public void createFileChooser() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open Resource File");
        fileChooser.getExtensionFilters().addAll(
                new ExtensionFilter("Text Files", "*.txt"),
                new ExtensionFilter("Image Files", "*.png", "*.jpg", "*.gif"),
                new ExtensionFilter("Audio Files", "*.wav", "*.mp3", "*.aac"),
                new ExtensionFilter("All Files", "*.*"));
        File selectedFile = fileChooser.showOpenDialog(SignupJavaFXView.getSignupStage());
        System.out.println(selectedFile.getPath());
        photoFile.appendText(selectedFile.getPath());
    }



    public void createAccount() throws IOException {

        if ( firstName.getText().equals("") || lastName.getText().equals("") || dob.getText().equals("")
                || gender.getText().equals("") || uname.getText().equals("") || pw.getText().equals("") ) {
            failFieldsNotComplete.setVisible(true); }

        if ( !email.getText().matches("\\w+@\\w+\\.\\w+") ) {
            failEmailFormat.setVisible(true); }

        if ( !pw.getText().equals(confirmpw.getText()) ) {
            failSamePassword.setVisible(true); }

        if ( !pw.getText().matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,64}") ) {
            failPasswordFormat.setVisible(true); }

        if ( UserDB.getUsers().contains(uname.getText()) ) {
            failUsernameExists.setVisible(true); }


        if ( !firstName.getText().equals("") && !lastName.getText().equals("") && !dob.getText().equals("")
                && !gender.getText().equals("") && !uname.getText().equals("") && !pw.getText().equals("")
                && pw.getText().equals(confirmpw.getText())
                && pw.getText().matches("(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,64}")
                && email.getText().matches("\\w+@\\w+\\.\\w+")
                && !(UserDB.getUsers().contains(uname.getText()))
                )

        { new RegistrationCompleteJavaFXView();
            User user = new User( uname.getText(), pw.getText() );
            UserDB.getUsers().add(user);
        }


        try {
            UserIO.writeUsers(UserDB.getUsers());
        } catch (IOException e) {
            e.printStackTrace(); }




    }
}

