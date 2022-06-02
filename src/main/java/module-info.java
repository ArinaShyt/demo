module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;

    opens com.example.demo to javafx.fxml;
    opens com.example.demo.DB;
    exports com.example.demo;
    exports com.example.demo.DB;
}