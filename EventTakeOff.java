package Airport.Events;

import Airport.Airplane.Aircraft;

public class EventTakeOff extends Events{
	private Direction Direction;

    public EventTakeOff(final Aircraft aircraft, Direction Direction)
    {
        super(aircraft);
        this.Direction = Direction;
    }

    public Direction getDirection() {
        return Direction;
    }

    @Override
    public String toString() {
        return Direction.name().toString();
    }

}
