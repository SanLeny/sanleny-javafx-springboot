package cn.sanleny.javafxspringboot;

import cn.sanleny.javafxspringboot.splashScreen.CustomSplash;
import cn.sanleny.javafxspringboot.view.LoginView;
import de.felixroske.jfxsupport.AbstractJavaFxApplicationSupport;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application extends AbstractJavaFxApplicationSupport {

    @Override
    public void start(Stage stage) throws Exception {
        super.start(stage);
    }

    public static void main(String[] args) {
//        launch(Application.class, LoginView.class, new CustomSplash(), args);
        launch(Application.class, LoginView.class, args);
    }

}
