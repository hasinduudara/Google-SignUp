package com.demo.googlesignup.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class SignupController {

    @FXML
    private PasswordField confirmPasswordField;

    @FXML
    private TextField emailField;

    @FXML
    private TextField firstNameField;

    @FXML
    private Button googleSignInButton;

    @FXML
    private TextField lastNameField;

    @FXML
    private Button manualInsertButton;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Button signupButton;

    @FXML
    private Label statusLabel;

    @FXML
    void handleManualInsert(ActionEvent event) {

    }

    @FXML
    void handleSignup(ActionEvent event) {

    }

}
