package Airport;

import Airport.Airplane.Aircraft;

public class Gate {
	String name;
	boolean isOpen;
	Aircraft aircraft;

	public Gate(String name) {
		this.name = name;
	}
	
	public void setAircraft(Aircraft aircraft) {
		this.aircraft = aircraft;
	}

	public Aircraft getAircraft() {
		return aircraft;
	}
	
	public void setOpen(boolean open) {
		this.isOpen = open;
	}
	
	public String getName() {
		return name;
	}
}
