package controller;

import javafx.scene.control.ChoiceBox;
import javafx.scene.input.KeyEvent;

public class LoginController {
  public   ChoiceBox poop=null;
    public void onkeyTyped(KeyEvent keyEvent) {
        System.out.println("A key was typed");
    }

    public void onkeyType(KeyEvent keyEvent) {
        System.out.println("A key was typed");


    }

    public void onKeyPress(KeyEvent keyEvent) {
        poop.setRotate(poop.getRotate()+1);
    }

}
