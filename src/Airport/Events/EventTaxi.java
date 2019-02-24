package Airport.Events;

import Airport.Location;
import Airport.Airplane.Aircraft;

public class EventTaxi extends Events{
	private Location startpoint;
    private Location endpoint;

    public EventTaxi(Aircraft aircraft,
                     Location startpoint,
                     Location endpoint)
    {
        super(aircraft);

        this.startpoint = startpoint;
        this.endpoint = endpoint;
    }

    public Location getStartpoint() {
        return startpoint;
    }

    public Location getEndpoint() {
        return endpoint;
    }
}
