import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class randomizadoroutfit extends PApplet {

PImage[] pantalon = new PImage[6];
PImage[] polera = new PImage[4];
PImage[] chaqueta = new PImage[6];
PImage[] zapatos = new PImage[3];
PImage[] sueter = new PImage[7];

PImage fondo;
//PImage marco;
//PImage titulo;

float px;
float py;
  
public void setup() {
  
   noStroke();
   fill(102);
   //size (displayWidth, displayHeight);
   imageMode(CENTER);
   fondo = loadImage("fondo/fondo.png");
  //marco = loadImage("marco/marco.png");
 //marco.resize(1120,0);
 //titulo = loadImage("titulo/titulo.png");
 //titulo.resize(1920,0);
 
for (int i = 0; i < pantalon.length; i++) {
 pantalon[i] = loadImage("pantalon/pantalon"+i+".png");
 pantalon[i].resize(1000,0);
}
  for (int i = 0; i < polera.length; i++) {
  polera[i] = loadImage("polera/polera"+i+".png");
  polera[i].resize(1000,0);
  }
  for (int i = 0; i < chaqueta.length; i++) {
  chaqueta[i] = loadImage("chaqueta/chaqueta"+i+".png");
  chaqueta[i].resize(1000,0);
  }
  for (int i = 0; i < zapatos.length; i++) {
  zapatos[i] = loadImage("zapatos/zapatos"+i+".png");
  zapatos[i].resize(1000,0);
  }
  for (int i = 0; i < sueter.length; i++) {
  sueter[i] = loadImage("sueter/sueter"+i+".png");
  sueter[i].resize(1000,0);
  }



noLoop();

}


public void draw() {
 background(255);
 
  
  image(zapatos[(int)random(zapatos.length)],displayWidth / 2, displayHeight / 2);
  image(pantalon[(int)random(pantalon.length)],displayWidth / 2, displayHeight / 2);
  image(polera[(int)random(polera.length)],displayWidth / 2, displayHeight / 2);
  image(sueter[(int)random(sueter.length)],displayWidth / 2, displayHeight / 2);
  image(chaqueta[(int)random(chaqueta.length)],displayWidth / 2, displayHeight / 2);

//tint(255,127);
//image(marco,displayWidth/2, displayHeight/2);
image(fondo,displayWidth/2, displayHeight/2);
//image(titulo,displayWidth/2, displayHeight/2);
}


public void mousePressed() {
 print("OK ");
  redraw();

}
  public void settings() {  fullScreen(); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "randomizadoroutfit" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
