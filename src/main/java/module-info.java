module local.sasouza.calculadora.javafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens local.sasouza.calculadora.javafx to javafx.fxml;
    
    exports local.sasouza.calculadora.javafx;
}
