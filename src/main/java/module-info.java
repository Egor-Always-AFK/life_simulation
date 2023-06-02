module com.example.life_simulation {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.life_simulation to javafx.fxml;
    exports com.example.life_simulation;
}