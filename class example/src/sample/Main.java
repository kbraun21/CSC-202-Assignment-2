package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main {
    public static void main(String[] args) {
        //write code here

        int n=1;
        print(n);
    }

    public static int print(int n) {
        System.out.println(n);
        if (n == 10) {
            return n;
        } else {
            n++;
            return print(n);

        }
    }

}
