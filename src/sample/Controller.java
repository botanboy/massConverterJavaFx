package sample;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyEvent;
import javafx.scene.text.Text;

public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField textField;

    @FXML
    private ChoiceBox<String> choiseBox = new ChoiceBox<>();


    @FXML
    private Text tonnText;

    @FXML
    private Text tgText;

    @FXML
    private Text trText;

    @FXML
    void TextField(KeyEvent event) {
        float n1 = Float.parseFloat(textField.getText());
        String rslt = Float.toString(n1);
        if (choiseBox.getValue() == "Тонны") {
            tonnText.setText(rslt);
            n1 *= 1000;
            tgText.setText(String.valueOf(n1));
            n1 *= 1000;
            trText.setText(String.valueOf(n1));
        }else if (choiseBox.getValue() == "Килограммы"){
            tgText.setText(rslt);
            n1 /= 1000;
            tonnText.setText(String.valueOf(n1));
            n1 *= 1000000;
            trText.setText(String.valueOf(n1));
        }else {
            trText.setText(rslt);
            n1 *= 1000;
            tgText.setText(String.valueOf(n1));
            n1 *= 1000;
            tonnText.setText(String.valueOf(n1));

        }


    }

    @FXML
    void initialize() {
        choiseBox.getItems().addAll("Тонны", "Килограммы", "Граммы");
        choiseBox.setValue("Тонны");

    }



}
