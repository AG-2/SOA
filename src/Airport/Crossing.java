package Airport;

public class Crossing {
	Location crossA;
	Location crossB;
	
	public Crossing(Location crossA, Location crossB) {
		this.crossA = crossA;
		this.crossB = crossB;
	}
	
	public static Location getLocationtoCross(Crossing cross) {
		return crossA;
	}
}
