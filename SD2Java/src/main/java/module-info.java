module com.example.sd2java {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.sd2java to javafx.fxml;
    exports com.example.sd2java;
}