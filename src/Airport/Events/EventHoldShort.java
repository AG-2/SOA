package Airport.Events;
import javax.tools.JavaFileManager.Location;

import Airport.Airplane.Aircraft;

public class EventHoldShort extends Events{

	private final Location location;
	
	public EventHoldShort(final Aircraft aircraft, final Airport.Location location) {
		super(aircraft);
		this.location = (Location) location;
	}
	
	public Location getLocation() {
		return location;
	}
}
