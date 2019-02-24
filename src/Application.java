import Airport.Airport;
import Airport.Location;
import Airport.Runway;
import Airport.Airplane.Aircraft;
import Airport.Tower;

public class Application {

	public static void main(String[] args) {
		Airport airport = new Airport("BER");
		Runway runway;
		Location location;
		Aircraft aircraft;
		
		airport.buildLocations();
		
	}

}
