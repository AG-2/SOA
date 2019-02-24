package Airport.Airplane;

public class FlightAttendant extends Crew{
	boolean isPurser;
	
	public FlightAttendant(Employee employee, boolean isPurser) {
		super(employee);
		this.isPurser = isPurser;
	}
}
