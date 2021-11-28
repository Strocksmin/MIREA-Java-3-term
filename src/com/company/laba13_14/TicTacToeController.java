package com.company.laba13_14;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.sql.Array;

public class TicTacToeController {

    boolean isPlayer = false;

    int[][] matrix =  {
            {-10,-10,-10,-10},
            {-10,-10,-10,-10},
            {-10,-10,-10,-10},
            {-10,-10,-10,-10}
    };;

    int win = 0;

    String checkWinner() {
        win = 0;
        // по горизонтали
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                win = win + matrix[i][j];
            }
            if (win == 0) return "Победили нолики";
            else if (win == 4) return "Победили крестики";
            win = 0;
        }
        win = 0;
        // по вертикали
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                win = win + matrix[j][i];
            }
            if (win == 0) return "Победили нолики";
            else if (win == 4) return "Победили крестики";
            win = 0;
        }
        win = 0;
        // диагональ слева-направо
        for (int i = 0, j = 0; i < 4; i++, j++) {
                win = win + matrix[i][j];
        }
        if (win == 0) return "Победили нолики";
        else if (win == 4) return "Победили крестики";
        win = 0;
        // диагональ справа-налево
        for (int i = 0, j = 3; i < 4; i++, j--) {
            win = win + matrix[i][j];
        }
        if (win == 0) return "Победили нолики";
        else if (win == 4) return "Победили крестики";
        return "";
    }

    @FXML
    private Button button00;

    @FXML
    private Button button01;

    @FXML
    private Button button02;

    @FXML
    private Button button03;

    @FXML
    private Button button10;

    @FXML
    private Button button11;

    @FXML
    private Button button12;

    @FXML
    private Button button13;

    @FXML
    private Button button20;

    @FXML
    private Button button21;

    @FXML
    private Button button22;

    @FXML
    private Button button23;

    @FXML
    private Button button30;

    @FXML
    private Button button31;

    @FXML
    private Button button32;

    @FXML
    private Button button33;

    @FXML
    private TextField title2;

    @FXML
    void button00Clicked(ActionEvent event) {
        if (!isPlayer && !(button00.getText().equals("O") || button00.getText().equals("X"))) {
            button00.setText("O");
            matrix[0][0] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button00.getText().equals("O") || button00.getText().equals("X"))) {
            button00.setText("X");
            matrix[0][0] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button01Clicked(ActionEvent event) {
        if (!isPlayer && !(button01.getText().equals("O") || button01.getText().equals("X"))) {
            button01.setText("O");
            matrix[0][1] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button01.getText().equals("O") || button01.getText().equals("X"))){
            button01.setText("X");
            matrix[0][1] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button02Clicked(ActionEvent event) {
        if (!isPlayer && !(button02.getText().equals("O") || button02.getText().equals("X"))) {
            button02.setText("O");
            matrix[0][2] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button02.getText().equals("O") || button02.getText().equals("X"))){
            button02.setText("X");
            matrix[0][2] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button03Clicked(ActionEvent event) {
        if (!isPlayer && !(button03.getText().equals("O") || button03.getText().equals("X"))) {
            button03.setText("O");
            matrix[0][3] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button03.getText().equals("O") || button03.getText().equals("X"))){
            button03.setText("X");
            matrix[0][3] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button10Clicked(ActionEvent event) {
        if (!isPlayer && !(button10.getText().equals("O") || button10.getText().equals("X"))) {
            button10.setText("O");
            matrix[1][0] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button10.getText().equals("O") || button10.getText().equals("X"))){
            button10.setText("X");
            matrix[1][0] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button11Clicked(ActionEvent event) {
        if (!isPlayer && !(button11.getText().equals("O") || button11.getText().equals("X"))) {
            button11.setText("O");
            matrix[1][1] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button11.getText().equals("O") || button11.getText().equals("X"))){
            button11.setText("X");
            matrix[1][1] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button12Clicked(ActionEvent event) {
        if (!isPlayer && !(button12.getText().equals("O") || button12.getText().equals("X"))) {
            button12.setText("O");
            matrix[1][2] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button12.getText().equals("O") || button12.getText().equals("X"))){
            button12.setText("X");
            matrix[1][2] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button13Clicked(ActionEvent event) {
        if (!isPlayer && !(button13.getText().equals("O") || button13.getText().equals("X"))) {
            button13.setText("O");
            matrix[1][3] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button13.getText().equals("O") || button13.getText().equals("X"))){
            button13.setText("X");
            matrix[1][3] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button20Clicked(ActionEvent event) {
        if (!isPlayer && !(button20.getText().equals("O") || button20.getText().equals("X"))) {
            button20.setText("O");
            matrix[2][0] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button20.getText().equals("O") || button20.getText().equals("X"))){
            button20.setText("X");
            matrix[2][0] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button21Clicked(ActionEvent event) {
        if (!isPlayer && !(button21.getText().equals("O") || button21.getText().equals("X"))) {
            button21.setText("O");
            matrix[2][1] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button21.getText().equals("O") || button21.getText().equals("X"))){
            button21.setText("X");
            matrix[2][1] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button22Clicked(ActionEvent event) {
        if (!isPlayer && !(button22.getText().equals("O") || button22.getText().equals("X"))) {
            button22.setText("O");
            matrix[2][2] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button22.getText().equals("O") || button22.getText().equals("X"))){
            button22.setText("X");
            matrix[2][2] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button23Clicked(ActionEvent event) {
        if (!isPlayer && !(button23.getText().equals("O") || button23.getText().equals("X"))) {
            button23.setText("O");
            matrix[2][3] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button23.getText().equals("O") || button23.getText().equals("X"))){
            button23.setText("X");
            matrix[2][3] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button30Clicked(ActionEvent event) {
        if (!isPlayer && !(button30.getText().equals("O") || button30.getText().equals("X"))) {
            button30.setText("O");
            matrix[3][0] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button30.getText().equals("O") || button30.getText().equals("X"))){
            button30.setText("X");
            matrix[3][0] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button31Clicked(ActionEvent event) {
        if (!isPlayer && !(button31.getText().equals("O") || button31.getText().equals("X"))) {
            button31.setText("O");
            matrix[3][1] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button31.getText().equals("O") || button31.getText().equals("X"))){
            button31.setText("X");
            matrix[3][1] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button32Clicked(ActionEvent event) {
        if (!isPlayer && !(button32.getText().equals("O") || button32.getText().equals("X"))) {
            button32.setText("O");
            matrix[3][2] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button32.getText().equals("O") || button32.getText().equals("X"))){
            button32.setText("X");
            matrix[3][2] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

    @FXML
    void button33Clicked(ActionEvent event) {
        if (!isPlayer && !(button33.getText().equals("O") || button33.getText().equals("X"))) {
            button33.setText("O");
            matrix[3][3] = 0;
            isPlayer = true;
            title2.setText(checkWinner());
        }
        else if (isPlayer && !(button33.getText().equals("O") || button33.getText().equals("X"))){
            button33.setText("X");
            matrix[3][3] = 1;
            isPlayer = false;
            title2.setText(checkWinner());
        }
    }

}
