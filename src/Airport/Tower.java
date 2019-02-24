package Airport;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import Airport.Airplane.Aircraft;
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
	
	public void runwayclearedtoLand(Aircraft aircraft, Runway runway) {
		eventBus.post(new EventTakeOff(aircraft, runway));
	}

	public void runwayclearedtoLand(String aircraft, String direction) {
		runwayclearedtoLand(Airport.airport.aircrafts.get(Airport.airport.aircrafts.indexOf(aircraft)), Runway.valueOf(direction));
	}

	public void runwayClearedToTakeoff(Aircraft aircraft, Runway runway) {
		eventBus.post(new EventTakeOff(aircraft, runway));
	}

	public void runwayClearedToTakeoff(String aircraft, Location runway) {
		runwayClearedToTakeoff(Airport.airport.aircrafts.get(Airport.airport.aircrafts.indexOf(aircraft)), Airport.getFreeRunway());
	}

	public void holdshort(Aircraft aircraft, Location location) {
		eventBus.post(new EventHoldShort(aircraft, location));
	}

	public void holdshort(String aircraft, String location){
	        holdshort(aircraft, location);
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
