package cn.sanleny.javafxspringboot.controller;

import cn.sanleny.javafxspringboot.Application;
import cn.sanleny.javafxspringboot.view.MainView;
import cn.sanleny.javafxspringboot.view.SecondView;
import de.felixroske.jfxsupport.FXMLController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.input.MouseEvent;
import javafx.scene.text.Text;
import javafx.stage.Modality;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @Author: sanleny
 * @Date: 2019-02-21
 * @Description: cn.sanleny.javafxspringboot.controller
 * @Version: 1.0
 */

@FXMLController
public class LoginController implements Initializable {

    @FXML private Text actiontarget;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML public void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Sign in button pressed");
        Application.showView(SecondView.class);
    }

    public void layoutAction(MouseEvent mouseEvent) {

    }
}
