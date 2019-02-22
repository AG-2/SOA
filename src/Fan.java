package Airport.Airplane;

import java.util.ArrayList;

public class Fan implements IFan{
	ArrayList<Blade> blades;
	int rpm;
	boolean isStarted = false;
	
	public Fan() {
		for(int i = 0; i < 96; i++) {
			if(i % 2 == 0)blades.add(new Blade(i, Material.Carbon));
			if(i % 2 == 1)blades.add(new Blade(i, Material.Titan));
		}
	}
	
	public void start() {
		isStarted = true;
	}
	
	public void increaseRPM(int value) {
		rpm = rpm + value;
	}
	
	public void decreaseRPM(int value) {
		rpm = rpm - value;
	}
	
	public void shutdown() {
		isStarted = false;
	}
}
