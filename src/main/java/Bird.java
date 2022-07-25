package main.java;

import java.awt.*;


public class Bird{
  //bird only mves vertically
   public int y ;
   public Bird(){
       BirdDrawing bird = new BirdDrawing(25);
   }

   class BirdDrawing{
       int size;
       public BirdDrawing(int size){
           this.size = size;
       }
        public void paintComponent(Graphics g ){
            Graphics2D g2 = (Graphics2D) g;
            BirdDrawing flappy = new BirdDrawing(25);
            flappy.draw(g2);
        }
       public void draw(Graphics2D g2){
           //placing teh bird at the beginning on the middle
//           Ellipse2D.Double ellipse = new Ellipse2D.Double(0, HEIGHT/2, size, size);
//           g2.draw(ellipse);
       }
    }
}