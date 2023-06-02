package com.example.life_simulation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;

import static java.lang.System.exit;

public class SimulationController {

    @FXML
    private Button close;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Line line;

    @FXML
    private AnchorPane mainWindow;

    @FXML
    private Button start;

    @FXML
    private Text startMessage;

    @FXML
    private Button step;

    @FXML
    private Text stepMessage;

    @FXML
    private Button stop;

    @FXML
    private Text stopMessage;

    @FXML
    private Pane window;

    @FXML
    void initialize() {
        close.setOnAction(event -> {
            exit(0);
        });
    }

}
