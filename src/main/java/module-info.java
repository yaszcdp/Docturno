module com.example.tpfinallab3 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires com.fasterxml.jackson.annotation;
    requires com.fasterxml.jackson.databind;
    requires com.fasterxml.jackson.datatype.jsr310;
    requires jbcrypt;
    requires com.fasterxml.jackson.core;



    exports com.example.tpfinallab3.models to com.fasterxml.jackson.databind;

    opens com.example.tpfinallab3 to javafx.fxml;
    exports com.example.tpfinallab3;

    exports com.example.tpfinallab3.controllers to javafx.fxml;
    opens com.example.tpfinallab3.controllers to javafx.fxml;

}