module com.gameapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.gameapp to javafx.fxml;
    exports com.gameapp;
}
