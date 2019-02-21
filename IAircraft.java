package Airport.Airplane;

import Airport.Events.EventTakeOff;
import Airport.Events.EventTaxi;
import Airport.Events.EventHoldShort;
import Airport.Events.EventLand;

public interface IAircraft {
	@Subscribe
	void taxi(EventTaxi eventTaxi);
	@Subscribe
	void holdShort(EventHoldShort eventHoldShort);
	@Subscribe
	void takeOff(EventTakeOff eventTakeOff);
	@Subscribe
	void land(EventLand eventLand);
}
