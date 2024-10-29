package org.example.checkboxwidgets;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;

public class CheckBoxWidgetsController {

    @FXML
    private CheckBox checkBox1;

    @FXML
    private CheckBox checkBox2;

    @FXML
    private CheckBox checkBox3;

    @FXML
    private Label label1;

    @FXML
    private Label label2;

    @FXML
    private Label label3;

    @FXML
    private void isBlocked(CheckBox checkBox) {

        FXMLLoader loader = new FXMLLoader(getClass().getResource("CheckBoxWidgets.fxml"));

        if (checkBox.isSelected()) {
            label1.setVisible(false);
        }
    }
}
