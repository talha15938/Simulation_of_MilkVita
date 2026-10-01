module cse213.simulation_of_milk_vita {
    requires javafx.controls;
    requires javafx.fxml;


    opens cse213.simulation_of_milk_vita to javafx.fxml;
    exports cse213.simulation_of_milk_vita;
}