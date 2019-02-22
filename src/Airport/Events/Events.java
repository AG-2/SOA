package Airport.Events;

import Airport.Airplane.Aircraft;

public class Events implements Airport.Events.IEvents {
    private Aircraft aircraft;

    Events(Aircraft aircraft)
    {
        this.aircraft = aircraft;
    }

    @Override
    public Aircraft getAircraft()
    {
        return aircraft;
    }

}
