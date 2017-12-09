package com.chasquionline.ugel.login.view;


import com.chasquionline.ugel.utils.Validate;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    @FXML private JFXTextField txtEmail;
    @FXML private JFXPasswordField txtPassword;
    @FXML private JFXButton btnSignIn;
    @FXML private JFXButton btnSignUp;
    @FXML private JFXProgressBar pgrBarLogin;

    private Validate validate;

    public void initialize(URL location, ResourceBundle resources) {
        hideProgressBar();
        validate = new Validate();

    }

    @FXML
    public void btnSignInClicked(ActionEvent actionEvent) {
        showProgressBar();
        setupRules();


        hideProgressBar();
    }

    @FXML
    public void btnSignUpClicked(ActionEvent actionEvent) {
        CreateAccountActivity activity = new CreateAccountActivity();
        Stage stage = new Stage();
        try {
            activity.start(stage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void lblCloseMouseClicked(MouseEvent mouseEvent) {
        System.exit(0);
    }

    private void setupRules() {
        validate.addValidate(txtEmail, "Campo email requerido");
        validate.addValidate(txtPassword, "Campo password requirido");
    }

    public void showProgressBar() {
        pgrBarLogin.setVisible(true);
    }

    public void hideProgressBar() {
        pgrBarLogin.setVisible(false);
    }
}
