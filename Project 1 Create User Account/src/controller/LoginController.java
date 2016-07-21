package controller;

import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.control.TextField;
import model.UserDB;
import utils.lists.ArrayIndexedList;
import utils.lists.ArrayOrderedList;
import utils.lists.IListIndexed;
import view.SignupJavaFXView;
import view.WelcomeJavaFXView;
import java.io.IOException;
import java.util.ArrayList;


import javafx.scene.control.PasswordField;


/**
 * Created by kristab21 on 7/6/16.
 */


public class LoginController extends ArrayIndexedList {
    @FXML
    TextField uname;
    @FXML
    PasswordField password;
    @FXML
    Label failAuthentication;


    boolean exist = false ;

    public void authenticate() throws IOException {

        for (int i = 0; i < UserDB.getUsers().size(); i++) {


            if (uname.getText().equals(UserDB.getUsers().get(i).getuname())
                    && password.getText().equals(UserDB.getUsers().get(i).getPassword()) )
            {
                new WelcomeJavaFXView();
                System.out.println("welcome" + " " + uname.getText() );
                exist = true;
                break;

            } else { failAuthentication.setVisible(true); }

        }
    }

    public void openSignupView() throws IOException {
        new SignupJavaFXView();
    }

}




