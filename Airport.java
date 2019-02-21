package Airport;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import Airport.Airplane.Aircraft;
import Airport.Airplane.Location;
import Airport.Airplane.Names.AircraftName;

public class Airport {
	String name;
	ArrayList<Gate> gates;
	static ArrayList<Aircraft> aircrafts;
	ArrayList<Location> locations;
	Tower tower;
	public static Airport airport = new Airport("BER");
	private Map<String,Aircraft> aircraftHashMap =new HashMap<>();
	
	public Airport(String name) {
		this.name = name;
		this.tower = new Tower();
	}
	
	public void build() {
		gates.add(new Gate("A01"));
		gates.add(new Gate("A02"));
		gates.add(new Gate("A03"));
		gates.add(new Gate("A04"));
		gates.add(new Gate("A05"));
		gates.add(new Gate("B01"));
		gates.add(new Gate("B02"));
		gates.add(new Gate("B03"));
		gates.add(new Gate("B04"));
		gates.add(new Gate("B05"));
		for(int i = 0; i < 10; i++) {
			locations.add(new Location(gates.get(i).name));
		}
		for(int i = 1; i < 11; i++) {
			aircrafts.add(new Aircraft( i, locations.get(i-1)));
		}
	}
	
	public void registAirplane() {
		for(int i = 1; i < 10; i ++) {
			aircraftHashMap.put(aircrafts.get(i).getAircraftName().toString(), aircrafts.get(i));
		}
	}
	
	public Aircraft getAircraft(String name) {
		return aircraftHashMap.get(name);
	}
}
