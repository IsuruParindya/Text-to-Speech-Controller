module com.example.texttospeechgui {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires freetts;


    opens com.example.texttospeechgui to javafx.fxml;
    exports com.example.texttospeechgui;
}