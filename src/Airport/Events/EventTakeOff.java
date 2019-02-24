package Airport.Events;

import Airport.Location;
import Airport.Runway;
import Airport.Airplane.Aircraft;

public class EventTakeOff extends Events{
	private Runway runway;

    public EventTakeOff(final Aircraft aircraft, Runway runway2)
    {
        super(aircraft);
        this.runway = runway2;
    }

    public Runway getDirection() {
        return runway;
    }
}
