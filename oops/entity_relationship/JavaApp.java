package edu.jecrc.sdt_java.oops.entity_relationship;

public class JavaApp {
	public static void execution() {
		Engine engine = new Engine(1500, "water based", 4);
		
		Car car = new Car("Hyuandai", "Creta", "Made In India", 987456.32, engine);
		
		car.displayCarDetails();
		
		car.getEngine().displayEngineDetails();
		
		MediaPlayer mediaPlayer = new MediaPlayer("Music Player", "Boat", 365487.25);	
		
		car.setMediaPlayer(mediaPlayer);
		car.getMediaPlayer().displayMediaDetails();
		
	}
}
