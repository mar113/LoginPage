package sample.Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class DetailsController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label uname;

    @FXML
    void initialize() {

    }

    void setUname(String name)
    {
        uname.setText(name);
    }
}
