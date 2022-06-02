module com.example.exam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.persistence;
    requires java.naming;
    requires java.sql;
    requires org.hibernate.orm.core;

    opens com.example.exam to javafx.fxml;
    opens com.example.exam.DB;
    exports com.example.exam;
    exports com.example.exam.DB;
}