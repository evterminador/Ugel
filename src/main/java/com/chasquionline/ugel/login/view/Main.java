package com.chasquionline.ugel.login.view;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("/layouts/activity_login.fxml"));
        primaryStage.initStyle(StageStyle.TRANSPARENT);
        //primaryStage.setTitle("Login");
        Scene scene = new Scene(root, 804, 454);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
