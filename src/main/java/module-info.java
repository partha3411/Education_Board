module mainpkg.educationboardms3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens mainpkg.educationboardms3 to javafx.fxml;
    exports mainpkg.educationboardms3;
}