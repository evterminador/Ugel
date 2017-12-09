package com.chasquionline.ugel.utils;


import com.chasquionline.ugel.login.view.LoginController;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import com.jfoenix.validation.NumberValidator;
import com.jfoenix.validation.RequiredFieldValidator;
import de.jensd.fx.glyphs.GlyphsBuilder;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIcon;
import de.jensd.fx.glyphs.fontawesome.FontAwesomeIconView;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;

public class Validate {
    RequiredFieldValidator requiredFieldValidator;
    NumberValidator numberValidator;

    @FXML
    private JFXTextField jfxTextField;
    @FXML
    private JFXPasswordField jfxPasswordField;

    public Validate() {}

    public void addValidate(final JFXTextField jfxTextField, String message) {
        requiredFieldValidator = new RequiredFieldValidator();

        jfxTextField.getValidators().add(requiredFieldValidator);

        String jfxPass = jfxTextField.getText();
        requiredFieldValidator.setMessage(message);

        if (isNullOrEmpty(jfxPass)) {
            jfxTextField.validate();
        }

        jfxTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    jfxTextField.validate();
                }
            }
        });


        setError();
    }

    public void addValidate(final JFXPasswordField jfxPasswordField, String message) {
        requiredFieldValidator = new RequiredFieldValidator();

        jfxPasswordField.getValidators().add(requiredFieldValidator);
        requiredFieldValidator.setMessage(message);

        String jfxPass = jfxPasswordField.getText();

        if (isNullOrEmpty(jfxPass)) {
            jfxPasswordField.validate();
        }

        jfxPasswordField.focusedProperty().addListener(new ChangeListener<Boolean>() {
            public void changed(ObservableValue<? extends Boolean> observable, Boolean oldValue, Boolean newValue) {
                if (!newValue) {
                    jfxPasswordField.validate();
                }
            }
        });

        setError();
    }

    private void setError() {
        requiredFieldValidator.setIcon(GlyphsBuilder.create(FontAwesomeIconView.class).glyph(FontAwesomeIcon.WARNING).size("1em").styleClass("error").build());
    }

    private boolean isNullOrEmpty(String x) {
        if (x == null || x.equals("")) {
            return true;
        }
        return false;
    }

}
