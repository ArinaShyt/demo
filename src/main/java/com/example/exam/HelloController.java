package com.example.exam;

import com.example.exam.DB.Interface;
import com.example.exam.DB.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class HelloController {
    public PasswordField password;
    public TextField loginF;
    @FXML
    private Label welcomeText;
    public String login;
    public static User user;

    public User authorization(ActionEvent actionEvent) {
        Interface userCRUD = new Interface();
        if (!loginF.getText().equals("") && !password.getText().equals("")) {
            try {

                if(loginF.getText().equals(user.getName()) && password.getText().equals(user.getPassword())) {
                    HelloApplication.setRoot("Nav");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return user;
    }



}