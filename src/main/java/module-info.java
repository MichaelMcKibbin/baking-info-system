module com.michaelmckibbin.baking {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.michaelmckibbin.baking to javafx.fxml;
    exports com.michaelmckibbin.baking;
}