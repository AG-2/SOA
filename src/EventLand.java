package Airport.Events;

import Airport.Airplane.Aircraft;

public class EventLand extends Events{
	private final Direction direction;

    public EventLand(final Aircraft aircraft, Direction Direction)
    {
        super(aircraft);
        this.direction = Direction;
    }

    public Direction getDirection() {
        return direction;
    }

    @Override
    public String toString() {
        return direction.name().toString();
    }

}
