package Airport.Airplane;

public interface IFan {
	void increaseRPM(int value);
	void decreaseRPM(int value);
	void start();
	void shutdown();
}
