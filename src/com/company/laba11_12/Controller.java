package com.company.laba11_12;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller {

    private char act;
    int one, two;

    @FXML
    private TextField title;

    //Stage mainWindow = (Stage) title.getScene().getWindow();

    @FXML
    private TextField title2;

    @FXML
    void btnD(ActionEvent event) {
        if (act != '/') {
            act = '/';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnM(ActionEvent event) {
        if (act != '-') {
            act = '-';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnMult(ActionEvent event) {
        if (act != '*') {
            act = '*';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnPlus(ActionEvent event) {
        if (act != '+') {
            act = '+';
            one = Integer.parseInt(title.getText());
            title.setText("");
        }
    }

    @FXML
    void btnOnClicked(ActionEvent event) {
        two = Integer.parseInt(title.getText());
        switch (act) {
            case '+':
                title2.setText(String.valueOf(one + two));
                break;
            case '*':
                title2.setText(String.valueOf(one * two));
                break;
            case '-':
                title2.setText(String.valueOf(one - two));
                break;
            case '/':
                if (two != 0) title2.setText(String.valueOf(one / two));
                break;
        }
    }
}
