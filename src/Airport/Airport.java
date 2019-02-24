package Airport;

import java.util.ArrayList;
import Airport.Airplane.Aircraft;

public class Airport {
	String name;
	ArrayList<Gate> gates;
	static ArrayList<Aircraft> aircrafts;
	static ArrayList<Location> locations;
	Tower tower;
	String test;
	static Airport airport = new Airport("BER");
	
	public Airport(String name) {
		this.name = name;
		this.tower = new Tower();
	}
	
	public void buildLocations() {
		//Start
		locations.add(new Location("S1"));
		locations.add(new Location("S2"));
		locations.add(new Location("S3"));
		locations.add(new Location("S4"));
		//runway
		locations.add(new Location("R26"));
		new Runway(locations.get(4));
		locations.add(new Location("L08"));
		new Runway(locations.get(5));
		locations.add(new Location("L26"));
		new Runway(locations.get(6));
		locations.add(new Location("R08"));
		new Runway(locations.get(7));
		//build Gates
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
		//add to Locationlist
	  /*
	   * Locationlist:
	   * 0:S1, 1:S2, 2:S3, 3:S4
	   * 4:R26, 5:L08, 6:L26, 7:R08
	   * 8:A01, 9:A02, 10:A03, 11:A04, 12:A05
	   * 13:B01, 14:B02, 15:B03, 16:B04, 17:B05
	   * 18-23: O1, O2, O3, O4, O5, O6
	   * 24-29: N1, N2, N3, N4, N5, N6
	   * 30-35: M1, M2, M3, M4, M5, M6
	   * 36-41: L1, L2, L3, L4, L5, L6
	   */
		for(int i = 0; i < 10; i++) {
			locations.add(new Location(gates.get(i).name));
		}
		//add Crossings
		test = "O";
		for(int i = 1; i < 7; i++) {
			locations.add(new Location(test + i));
			if(i == 6 && test == "O") i = 1; test = "N";
			if(i == 6 && test == "N") i = 1; test = "M";
			if(i == 6 && test == "M") i = 1; test = "L";
		}
		for(int i = 0; i < 10; i++) {
			if(i < 13) {
				Location.addGate(locations.get(i+8), gates.get(i), locations.get(i+18), locations.get(i+19));
				Location.addGate(locations.get(i+8), gates.get(i), locations.get(i+24), locations.get(i+25));
			}else {
				Location.addGate(locations.get(i+8), gates.get(i), locations.get(i+30), locations.get(i+31));
				Location.addGate(locations.get(i+8), gates.get(i), locations.get(i+36), locations.get(i+37));
			}
		}
		
		//add first Locations for aircrafts
		for(int i = 1; i < 11; i++) {
			aircrafts.add(new Aircraft( i, locations.get(i-1)));
		}	
		for(int i = 11; i < 21; i++) {
			aircrafts.add(new Aircraft( i, null));
		}	
	}

	public Location getFreeGate() {
		int j = 0;
		for(int i = 8; i < 18; i++) {
			if(Location.checkLocation(locations.get(i))) {
				j = i;
				break;
			}
		}
		return locations.get(j);
	}
	
	public static Location getFreeRunway() {
		int j = 0;
		for(int i = 4; i < 8; i++) {
			if(Location.checkLocation(locations.get(i))) {
				j = i;
				break;
			}else {
			
			}
		}
		return locations.get(j);
	}
	
	public static ArrayList taxiWay( Gate gate, Aircraft aircraft) {
		Location way;
		Location location = aircraft.getLocation();
		boolean bool = true;
		Crossing cross;
		int j = 0, i;
		ArrayList<Location> waytogate = new ArrayList();
		way = Crossing.getLocationtoCross(Location.getCrossingtoGate(gate));
		
		for(i = 18; i < 42; i++) {
			if(locations.get(i) == way) {
				j = i;
				break;
			}
		}

		while(bool) {
			switch(j) {
			case 18: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 19: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 20: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 21: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 22: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
				break;
			case 23: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j = 41;
				break;
			case 24: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j = 30;
				break;
			case 25: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 26: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 27: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 28: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 29: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 30: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 31: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 32: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 33: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 34: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j++;
			case 35: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j = 29;
				break;
			case 36: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 37: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 38: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break; 
			case 39: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 40: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j--;
				break;
			case 41: 
				waytogate.add(locations.get(j));
				Location.useLocation(aircraft, locations.get(j));
				Location.freeLocation(aircraft, locations.get(i));
				i = j;
				j = 18;
				break;
			}
			if(way == locations.get(j)) {
				bool = false;
			}
		}
			
		return waytogate;
	}
	
}
