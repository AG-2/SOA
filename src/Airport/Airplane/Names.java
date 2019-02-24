package Airport.Airplane;

public class Names{
	
	public enum AircraftName {
	F01, F02, F03, F04, F05, F06, F07, F08, F09, F10, F11, F12, F13, F14, F15, F16, F17, F18, F19, F20
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
		case 11: return AircraftName.F11;
		case 12: return AircraftName.F12;
		case 13: return AircraftName.F13;
		case 14: return AircraftName.F14;
		case 15: return AircraftName.F15;
		case 16: return AircraftName.F16;
		case 17: return AircraftName.F17;
		case 18: return AircraftName.F18;
		case 19: return AircraftName.F19;
		case 20: return AircraftName.F20;
		default: return null;
		}

	}
}