module com.example.csd214lab03jaspreet_singh {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.csd214lab03jaspreet_singh to javafx.fxml;
    exports com.example.csd214lab03jaspreet_singh;
}