package demos;

import processing.core.PApplet;

public class UserEvents extends PApplet{
	
	public void setup(){
		size(500,500);
		
		background(100,100,100);
		
		
		
	}
	
	public void draw(){
		drawButton();
		
		
	}

	private void drawButton() {
		// TODO Auto-generated method stub
		fill(255,255,255);
		rect(100,100,20,20);
		
		fill(255,0,0);
		rect(120,120,20,20);
		
		
	}
	public void mouseReleased(){
		if(mouseX > 100 && mouseX <120 && mouseY > 100 && mouseY < 120){
			background(50,50,50);
			text("Nice!!!", 150,150);
			
		}
		if(mouseX > 120 && mouseX < 140 && mouseY > 120 && mouseY < 140){
			background(150,150,150);
			text("cool!!!", 150,150);
		}
	}

}
