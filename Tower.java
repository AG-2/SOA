package Airport;

import Airport.Airplane.Aircraft;
import Airport.Airplane.Location;
import Airport.Airplane.Subscriber;
import Airport.Events.EventHoldShort;
import Airport.Events.EventTakeOff;

public class Tower implements ITower{
	private EventBus eventBus;
	private int eventID;
	
	public Tower() {
		this.eventBus = new EventBus();
	}
	
	public void addSubscriber(Subscriber subscriber) {
		eventBus.register(subscriber);
	}
	
	public void removeSubscriber(Subscriber subscriber) {
		eventBus.unregister(subscriber);
	}
	
	public void runwayclearedtoLand(Aircraft aircraft, Direction direction) {
		eventBus.post(new EventTakeOff(aircraft, direction));
	}

	public void runwayclearedtoLand(String aircraft, String direction) {
		runwayclearedtoLand(Airport.airport.getAircraft(aircraft), Direction.valueOf(Direction));
	}

	public void runwayClearedToTakeoff(Aircraft aircraft, Direktion direction) {
		eventBus.post(new EventTakeOff(aircraft, direction));
	}

	public void runwayClearedToTakeoff(String aircraft, String direction) {
		runwayClearedToTakeoff(Airport.airport.getAircraft(aircraft), Direction.valueOf(direction));
	}

	public void holdshort(Aircraft aircraft, Location location) {
		eventBus.post(new EventHoldShort(aircraft, location));
	}

	public void holdshort(String aircraft, String location){
	        holdshort(Airport.airport.getAircraft(aircraft), Airport.airport.getLocationmanager().getLocationByString(location));
	}
	
	public boolean locationTaken(Location location) {
		boolean test = true;
		for(int i = 0; i < 10; i ++) {
			if(Airport.aircrafts.get(i).getLocation() == location) {
				test = false;
			}
		}
		return test;
	}
}
