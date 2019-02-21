package Airport.Airplane;

import java.util.ArrayList;

public class Gear implements IGear{
	GearType type;
	boolean isDown = false;
	boolean isBrakeSet = false;
	ArrayList<Wheel> wheels;
	
	public Gear(GearType type) {
		this.type = type;
		build();
	}
	public void build() {
		if(type == GearType.Front) {
			for(int i = 0; i < 2; i++) {
				wheels.add(new Wheel(i));
			}
		}
		if(type == GearType.Rear) {
			for(int i = 0; i < 6; i++) {
				wheels.add(new Wheel(i));
			}
		}
	}
	
	public boolean isDown() {
		return isDown;
	}
	
	public boolean isBrakeSet() {
		return isBrakeSet;
	}
	
	public void up() {
		isDown = false;
	}
	
	public void down() {
		isDown = true;
	}
	
	public void setBrake() {
		isBrakeSet = true;
	}
	
	public void releaseBrake() {
		isBrakeSet = false;
	}
}
