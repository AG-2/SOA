package Airport.Airplane;

public class Pilot extends Crew{
	int flightExperienceInMiles;
	
	public Pilot(Employee employee, int flightExperienceInMiles) {
		super(employee);
		this.flightExperienceInMiles = flightExperienceInMiles;
	}

}
