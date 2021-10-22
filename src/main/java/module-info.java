module com.example.ejerciciointerfaces {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires eu.hansolo.tilesfx;

    opens com.example.ejerciciointerfaces to javafx.fxml;
    exports com.example.ejerciciointerfaces;
}