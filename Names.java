package Airport.Airplane;

public class Names{
	
	public enum AircraftName {
	F01, F02, F03, F04, F05, F06, F07, F08, F09, F10
	}
	
	public static AircraftName getAircraftName(int i) {
		switch(i) {
		case 1: return AircraftName.F01;
		case 2: return AircraftName.F02;
		case 3: return AircraftName.F03;
		case 4: return AircraftName.F04;
		case 5: return AircraftName.F05;
		case 6: return AircraftName.F06;
		case 7: return AircraftName.F07;
		case 8: return AircraftName.F08;
		case 9: return AircraftName.F09;
		case 10: return AircraftName.F10;
		default: return null;
		}

	}
}