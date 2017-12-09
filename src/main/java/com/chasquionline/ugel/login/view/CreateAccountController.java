package com.chasquionline.ugel.login.view;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXProgressBar;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class CreateAccountController implements Initializable{

    @FXML private JFXTextField txtUsername;
    @FXML private JFXTextField txtEmail;
    @FXML private JFXTextField txtCodigo;
    @FXML private JFXPasswordField txtPassword;
    @FXML private JFXPasswordField txtPasswordConfirmed;
    @FXML private JFXButton btnCreateAccount;
    @FXML private JFXProgressBar pgrBarCreateAccount;
    @FXML private ImageView imgBack;

    public void initialize(URL location, ResourceBundle resources) {
        hideProgressBar();
    }

    @FXML
    public void btnCreateAccountClicked(ActionEvent actionEvent) {
        showProgressBar();
    }

    @FXML
    public void onImageViewClicked(MouseEvent mouseEvent) {
        Stage stage = (Stage) imgBack.getScene().getWindow();
        stage.close();
    }

    public void showProgressBar() {
        pgrBarCreateAccount.setVisible(true);
    }

    public void hideProgressBar() {
        pgrBarCreateAccount.setVisible(false);
    }


}
