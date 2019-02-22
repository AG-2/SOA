package Airport.Airplane;
import java.util.ArrayList;
import Airport.Tower;
import Airport.Airplane.Names.AircraftName;
import Airport.Events.EventHoldShort;
import Airport.Events.EventLand;
import Airport.Events.EventTakeOff;
import Airport.Events.EventTaxi;


public class Aircraft extends Subscriber{
	int id;
	String manufacturer;
	int numberOfSeatFirstClass;
	int numberOfSeatBusinessClass;
	int numberOfSeatEconomyClass;
	ArrayList<Seat> seats;
	ArrayList<Wing> wings;
	ArrayList<Crew> crew;
	Location location;
	AircraftName aircraftName;
	
	
	public Aircraft(int id, Location location) {
		this.id = id;
		this.location = location;
		build();
	}
	
	public void build() {
		aircraftName = Names.getAircraftName(id);
		manufacturer = "Lufthansa";
		numberOfSeatFirstClass = 68;
		numberOfSeatBusinessClass = 150;
		numberOfSeatEconomyClass = 350;
		//Build seats
		for(int i = 0; i < numberOfSeatFirstClass; i++) {
			seats.add(new Seat(aircraftName.toString() , BookingClass.FirstClass));
		}
		for(int i = numberOfSeatFirstClass; i < numberOfSeatFirstClass + numberOfSeatBusinessClass; i++) {
			seats.add( new Seat(aircraftName.toString(), BookingClass.BusinessClass));
		}
		for(int i = numberOfSeatFirstClass + numberOfSeatBusinessClass; i < numberOfSeatFirstClass + numberOfSeatBusinessClass + numberOfSeatEconomyClass; i++) {
			seats.add( new Seat(aircraftName.toString(), BookingClass.EconomyClass));
		}
		//Build aircraftparts
		Gear frontgear = new Gear(GearType.Front);
		Gear reargear = new Gear(GearType.Rear);
		wings.add(new Wing("Right", new Flap(1)));
		wings.add(new Wing("Left", new Flap(1)));
		//Build crew
		crew.add(new FlightAttendant(new Employee("Julia Schneider"), false));
		crew.add(new FlightAttendant(new Employee("Katharina Hase"), true));
		crew.add(new FlightAttendant(new Employee("Kim Renz"), false));
		crew.add(new FlightAttendant(new Employee("Johanna Berhan"), false));
		crew.add(new Pilot(new Employee("Markus Schmid"), 5034));
		crew.add(new Pilot(new Employee("Johan Mueller"), 3923));
	}
	
	public AircraftName getAircraftName() {
		return aircraftName;
	}
	public void setLocation(Location location) {
		this.location = location;
	}
	
	public Location getLocation() {
		return location;
	}
	
	@Subscribe
	public void recieve(EventTaxi eventTaxi) {
		//fehlt noch location
		if(Tower.locationTaken()) {
			movetolocation();
		}else
		{
			System.out.println("Location taken");
		}
	}
	
	@Subscribe
	public void recieve(EventHoldShort eventHoldShort) {
		
	}
	
	@Subscribe
	public void recieve(EventLand eventLand) {
		
	}
	
	@Subscribe
	public void recieve(EventTakeOff eventTakeOff) {
		
	}
	
	public void movetolocation(Location location){
		System.out.println("Aircraft " + id + " moved from " + this.location.toString() + " to " + location.toString());
		this.location = location;
	}
}
