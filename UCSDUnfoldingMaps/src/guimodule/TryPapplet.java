package guimodule;

import processing.core.PApplet;
import processing.core.PGraphics;;

public class TryPapplet extends PApplet{
	PGraphics pg;
	

	public void setup(){
		
		size(500,500);
		//background(255,255,255);
		pg = createGraphics(100, 100);
		
		
	}
	public void draw(){
		pg.beginDraw();
		
		 pg.line(50, 50, mouseX, mouseY);
		 fill(0,0,0);
		 pg.text("Anything", mouseX, mouseY);
		 pg.endDraw();
	}
}
