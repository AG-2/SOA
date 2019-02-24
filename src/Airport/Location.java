package Airport;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Airport.Airplane.Aircraft;

public class Location {
	String locationName;
	static Map<Location, Gate> gatelocations = new HashMap<>();
	static Map<Gate, Crossing> crossings = new HashMap<>();
	static Map<Aircraft, Location> usedLocation = new HashMap<>();
	static Crossing cross;
	
	public Location(String name) {
		this.locationName = name;
	}
	
	public static void addGate(Location location, Gate gate, Location locA, Location locB) {
		 gatelocations.put(location, gate);
		 cross = new Crossing(locA, locB);
		 crossings.put(gate, cross);
	}
	
	public static Crossing getCrossingtoGate(Gate gate) {
		return crossings.get(gate);
	}
	
	public static void useLocation(Aircraft aircraft, Location location) {
		usedLocation.put(aircraft, location);
	}
	
	public static void freeLocation(Aircraft aircraft, Location location) {
		usedLocation.remove(aircraft, location);
	}
	
	public static boolean checkLocation(Location location) {
		if(usedLocation.equals(location)) {
			return true;
		}else {
			return false;
		}
	}
}
