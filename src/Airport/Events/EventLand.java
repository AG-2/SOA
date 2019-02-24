package Airport.Events;

import Airport.Runway;
import Airport.Airplane.Aircraft;

public class EventLand extends Events{
	private final Runway runway;

    public EventLand(final Aircraft aircraft, Runway runway)
    {
        super(aircraft);
        this.runway = runway;
    }

    public Runway getRunway() {
        return runway;
    }
}
