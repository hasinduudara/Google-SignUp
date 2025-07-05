module com.demo.googlesignup {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.demo.googlesignup to javafx.fxml;
    exports com.demo.googlesignup;
}