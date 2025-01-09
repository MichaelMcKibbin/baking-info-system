module com.michaelmckibbin.baking {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.michaelmckibbin.baking to javafx.fxml;
    exports com.michaelmckibbin.baking;
}