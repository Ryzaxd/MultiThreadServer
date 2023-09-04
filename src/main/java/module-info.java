module com.example.multihreadedserver {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.multiThreadServer to javafx.fxml;
    exports com.example.multiThreadServer;
}