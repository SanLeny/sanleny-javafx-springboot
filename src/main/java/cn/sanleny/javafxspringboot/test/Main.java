package cn.sanleny.javafxspringboot.test;

/**
 * @Author: sanleny
 * @Date: 2019-02-26
 * @Description: cn.sanleny.javafxspringboot
 * @Version: 1.0
 */
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("main.fxml"));
//        Parent root = FXMLLoader.load(getClass().getResource("main.fxml"));
        primaryStage.setTitle("HBox Button 自动增长");
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}

