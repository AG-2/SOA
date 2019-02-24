package Airport;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

import Airport.Airplane.Aircraft;
import Airport.Airplane.Subscriber;
import Airport.Events.EventHoldShort;
import Airport.Events.EventTaxi;

import java.util.List;
import java.util.stream.Collectors;

public class ApronControl
{
    private EventBus eventBus;
    private String name;
    private Airport airport;

    public ApronControl(String name,
                        Airport airport)
    {
        this.name = name;
        eventBus = new EventBus();
        this.airport = airport;
    }

    public void addSubscriber(Subscriber subscriber)
    {
        eventBus.register(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber)
    {
        eventBus.unregister(subscriber);
    }

    public void taxi(Aircraft aircraft, Location start, Location end)
    {
        eventBus.post(new EventTaxi(aircraft, start, end));
    }
    
    public void holdshort(Aircraft aircraft, Location location)
    {
        eventBus.post(new EventHoldShort(aircraft, location));
    }

    public void holdshort(String aircraft, String location)
    {
        holdshort(Airport.airport.getAircaft(aircraft), );
    }
}