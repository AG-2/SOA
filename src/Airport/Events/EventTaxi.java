package Airport.Events;
import java.awt.List;

import Airport.Airplane.Aircraft;

public class EventTaxi {
	private Location startpoint;
    private List<Location> junktionList;
    private Location endpoint;

    public EventTaxi(Aircraft aircraft,
                     Location startpoint,
                     List<Location> junktionList,
                     Location endpoint)
    {
        super(aircraft);


        this.startpoint = startpoint;
        this.junktionList = junktionList;
        this.endpoint = endpoint;
    }

    public List<Location> getJunktionList() {
        return junktionList;
    }

    public Location getStartpoint() {
        return startpoint;
    }

    public Location getEndpoint() {
        return endpoint;
    }

    @Override
    public String toString() {
        return startpoint.toString() + " " + junktionList.toString() + " " + endpoint;
    }

}
