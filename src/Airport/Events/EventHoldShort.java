package Airport.Events;
import javax.tools.JavaFileManager.Location;

import Airport.Airplane.Aircraft;

public class EventHoldShort extends Events{

	private final Location location;
	
	public EventHoldShort(final Aircraft aircraft, final Airport.Airplane.Location location2) {
		super(aircraft);
		this.location = location2;
	}
	
	public Location getLocation() {
		return location;
	}
	
	@Override
	public String toString() {
		return location.toString();
	}
}
