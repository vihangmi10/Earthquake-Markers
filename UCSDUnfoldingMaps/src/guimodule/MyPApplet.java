package guimodule;

import processing.core.PApplet;
import processing.core.PImage;

public class MyPApplet extends PApplet{

	PImage img;
	
	public void setup(){
		size(400,400);
		img = loadImage("http://cseweb.ucsd.edu/~minnes/palmTrees.jpg", "jpg");
		img.resize(0, height);
		image(img,0,0);
		
		
		
	}
	
	public void draw(){
		
	}

}
