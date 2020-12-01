package zza06_javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.log4j.Logger;

public class ZZA07_JavaFX_log4j extends Application {

    private static final Logger logger = Logger.getLogger(ZZA07_JavaFX_log4j.class);

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(root);
        logger.debug("Создание новой сцены");
        stage.setScene(scene);
        stage.setResizable(false);
        logger.debug("Запрет изменения размера окна");
        stage.show();
        logger.debug("Включение отображения сцены");
        stage.setTitle("Калькулятор JavaFX");
        logger.debug("Установка заголовка окна 'Calculator JavaFX'");
    }

    public static void main(String[] args) {
        launch(args);
    }

}
