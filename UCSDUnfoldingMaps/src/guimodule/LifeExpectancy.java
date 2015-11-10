package guimodule;

import java.util.HashMap;
import java.util.Map;

import de.fhpotsdam.unfolding.UnfoldingMap;
import de.fhpotsdam.unfolding.providers.Google;
import de.fhpotsdam.unfolding.utils.MapUtils;
import processing.core.PApplet;

public class LifeExpectancy extends PApplet {
UnfoldingMap map;

Map <String, Float> lifeExp;



	public void setup(){
		size(800,600,OPENGL);
		map = new UnfoldingMap (this, 50,50,700,500,new Google.GoogleMapProvider());
		
		MapUtils.createDefaultEventDispatcher(this, map);
		lifeExp = loadLifeExpectancyFromCSV ("data/LifeExpectancyWorldBank.csv");
		
		
	}
	private Map<String, Float> loadLifeExpectancyFromCSV(String filename) {
		// TODO Auto-generated method stub
		
		
		Map<String, Float> lifeExp = new HashMap<String, Float>();
		
		String[] rows = loadStrings(filename);
		
		return lifeExp;
	}
	public void draw(){
		
		map.draw();
	}
	

}



