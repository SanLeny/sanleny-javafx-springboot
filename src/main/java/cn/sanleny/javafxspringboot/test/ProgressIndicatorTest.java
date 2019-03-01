package cn.sanleny.javafxspringboot.test;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.stage.Stage;

/**
 * @Author: sanleny
 * @Date: 2019-02-26
 * @Description: cn.sanleny.javafxspringboot.test
 * @Version: 1.0
 */
public class ProgressIndicatorTest extends Application {

    @Override
    public void start(Stage stage) {
        Group root = new Group();
        Scene scene = new Scene(root, 260, 80);
        stage.setScene(scene);

        Group g = new Group();

        ProgressIndicator p1 = new ProgressIndicator();

        g.getChildren().add(p1);

        scene.setRoot(g);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
