package com.example.javafxdemo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    @FXML
    TextArea questionArea,questionArea2,questionArea3;
    @FXML
    RadioButton answer1_1, answer1_2, answer1_3, answer1_4,answer2_1, answer2_2, answer2_3, answer2_4
                , answer3_1, answer3_2, answer3_3, answer3_4;
    @FXML
    ToggleGroup answersGrp1;
    @FXML
    ToggleGroup answersGrp2;
    @FXML
    ToggleGroup answersGrp3;
    private String[] questions = {"Для чего можно использовать Java?","Как объявить класс в коде?","Чем является ключевое слово «public»?"};
    private String[] variants = {
            "для разработки сайтов","для создания игр","для создания программ для ПК","для всего перечисленного"
    };
    private String[] variants2 = {
            "class MyClass {}","new class MyClass {}","select * from class MyClass {}","MyClass extends class {}"
    };
    private String[] variants3 = {"литералом","оператором","модификатором доступа","типом данных"};
    private String[] correctVariant = {"для всего перечисленного","class MyClass {}","модификатором доступа"};
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        questionArea.setText(questions[0]);
        answer1_1.setText(variants[0]);
        answer1_2.setText(variants[1]);
        answer1_3.setText(variants[2]);
        answer1_4.setText(variants[3]);
        questionArea2.setText(questions[1]);
        answer2_1.setText(variants2[0]);
        answer2_2.setText(variants2[1]);
        answer2_3.setText(variants2[2]);
        answer2_4.setText(variants2[3]);
        questionArea3.setText(questions[2]);
        answer3_1.setText(variants3[0]);
        answer3_2.setText(variants3[1]);
        answer3_3.setText(variants3[2]);
        answer3_4.setText(variants3[3]);
    }

    public void tryToAnswer1() {
        if(((RadioButton)answersGrp1.getSelectedToggle()).getText().equals(correctVariant[0])){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Правильно!");
            alert.showAndWait();
        } else {
            Alert alert=new Alert(Alert.AlertType.ERROR,"Не правильно!");
            alert.showAndWait();
        }
        //System.out.println(((RadioButton)answers.getSelectedToggle()).getText());
    }
    public void tryToAnswer2() {
        if(((RadioButton)answersGrp2.getSelectedToggle()).getText().equals(correctVariant[1])){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Правильно!");
            alert.showAndWait();
        } else {
            Alert alert=new Alert(Alert.AlertType.ERROR,"Не правильно!");
            alert.showAndWait();
        }
        //System.out.println(((RadioButton)answers.getSelectedToggle()).getText());
    }
    public void tryToAnswer3() {
        if(((RadioButton)answersGrp3.getSelectedToggle()).getText().equals(correctVariant[2])){
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Правильно!");
            alert.showAndWait();
        } else {
            Alert alert=new Alert(Alert.AlertType.ERROR,"Не правильно!");
            alert.showAndWait();
        }
        //System.out.println(((RadioButton)answers.getSelectedToggle()).getText());
    }

    public void clickExit() {
        System.exit(0);
    }
}