package cn.sanleny.javafxspringboot.splashScreen;

import de.felixroske.jfxsupport.SplashScreen;
import javafx.scene.Parent;
import javafx.scene.control.ProgressBar;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;

/**
 * 启动页
 * @Author: sanleny
 * @Date: 2019-02-21
 * @Description: cn.sanleny.javafxspringboot.splashScreen
 * @Version: 1.0
 */
public class CustomSplash extends SplashScreen{

    /**
     * Override this to create your own splash pane parent node.
     *
     * @return A standard image
     */
    @Override
    public Parent getParent() {
        final ImageView imageView = new ImageView(Thread.currentThread().getContextClassLoader().getResource(getImagePath()).toExternalForm());
        final ProgressBar splashProgressBar = new ProgressBar();
        splashProgressBar.setPrefWidth(imageView.getImage().getWidth());

        final VBox vbox = new VBox();
        vbox.getChildren().addAll(imageView, splashProgressBar);

        return vbox;
    }

    /**
     * Use your own splash image instead of the default one
     *
     * @return "/splash/javafx.png"
     */
    @Override
    public String getImagePath() {
//        return super.getImagePath();
        return "static/images/blue_beijing.png";
    }

    /**
     * Customize if the splash screen should be visible at all
     *
     * @return true by default
     */
    @Override
    public boolean visible() {
        return super.visible();
    }

}
