package sample;

import javafx.animation.TranslateTransition;
import javafx.scene.layout.Region;
import javafx.scene.shape.Ellipse;
import javafx.util.Duration;


public class Bird extends Region {
  //bird only mves vertically
   public int y ;
   public Bird(int xRadius, int yRadius){
       Ellipse corpse = new Ellipse(xRadius, yRadius);
       corpse.setCenterX(Constants.WIDTH/9);
       y = Constants.HEIGHT/2;
       corpse.setCenterY(y);
       getChildren().add(corpse);
   }

   public int update(){
       double velocity = y + Constants.GRAVITY;
       y += velocity;
       return y;
   }
   
   public void playTrans(){
       // Set up a Translate Transition for the Text object
       TranslateTransition trans = new TranslateTransition(Duration.seconds(2), this);
       trans.setFromY(y);
       trans.setToY(update());
       // Let the animation run forever
       trans.setCycleCount(TranslateTransition.INDEFINITE);
       // Play the Animation
       trans.play();
   }



}