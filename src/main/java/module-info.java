module org.utleon.zarape {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.utleon.zarape to javafx.fxml;
    exports org.utleon.zarape;
}