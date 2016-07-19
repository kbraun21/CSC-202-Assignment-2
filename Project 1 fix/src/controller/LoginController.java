

/**
 * Created by kristab21 on 7/6/16.
 */
package controller;

        import javafx.fxml.FXML;
        import javafx.scene.control.*;
        import javafx.scene.control.TextField;
        import model.UserDB;
        import view.SignupJavaFXView;
        import view.WelcomeJavaFXView;
        import java.io.IOException;


public class LoginController {
    @FXML
    TextField uname;
    @FXML
    PasswordField password;
    @FXML
    Label failAuthentication;


    public void openSignupView() throws IOException {
        new SignupJavaFXView();
    }


    public void authenticate() throws IOException {
        //iterate thru the userDB to find if username exists

        for (int i = 0; i < UserDB.getUsers().size(); i++) {
            //compare username from user input to each username from userDB

            if (uname.getText().equals(UserDB.getUsers().get(i).getuname())
                    && password.getText().equals(UserDB.getUsers().get(i).getPassword())) {
                new WelcomeJavaFXView();
                System.out.println("welcome" + " " + uname.getText() );
                break;
            } else {
                failAuthentication.setVisible(true);
            }
        }
    }
}




