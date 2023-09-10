module com.example.innovestaproject {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires lombok;
    requires javafx.graphics;
            
                            
    opens com.example.innovestaproject to javafx.fxml;
    exports com.example.innovestaproject;
}