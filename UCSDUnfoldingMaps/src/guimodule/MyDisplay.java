package guimodule;

import processing.core.PApplet;

public class MyDisplay extends PApplet{


	public void setup(){
		
		size(400,400);
		background(200,200,200);
		
	} 
	
	public void draw(){
		fill(255,209,0);
		
		ellipse(200,200,200,200);
		fill(0,0,0);
		ellipse(160,160,30,30);
		ellipse(240,160,30,30);
		noFill();
		
		arc(200,240, 75,75,0,PI);
		
		
	}
}
