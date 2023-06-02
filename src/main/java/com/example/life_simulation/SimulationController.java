package com.example.life_simulation;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import com.example.life_simulation.LoopSimulation;

import static java.lang.System.exit;

public class SimulationController {

    LoopSimulation loopSimulation = new LoopSimulation();
    @FXML
    private Button close;

    @FXML
    private ResourceBundle resources;

    @FXML
    private TextField numOfHerbiovere;

    @FXML
    private TextField numOfPredators;

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
            if (loopSimulation.getIsStart()) {
                try {
                    loopSimulation.stopSimulation();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            exit(0);
        });

        start.setOnAction(event -> {
            try {
                loopSimulation.startSimulaton();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        stop.setOnAction(event -> {
            try {
                loopSimulation.stopSimulation();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });

        numOfHerbiovere.setOnAction(event -> {
            System.out.println(numOfHerbiovere.getText());
        });

        numOfPredators.setOnAction(event -> {
            System.out.println(numOfPredators.getText());
        });
    }
}
