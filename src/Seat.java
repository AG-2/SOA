package Airport.Airplane;

public class Seat {
	BookingClass bookingClass;
	String id;
	
	public Seat(String i, BookingClass bookingClass) {
		this.id = i;
		this.bookingClass = bookingClass;
	}
}
