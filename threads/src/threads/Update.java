package threads;

public class Update {
	
	int sensor;
	int value;
	
	public Update(int sensor, int value) {
		this.sensor = sensor;
		this.value = value;
	}
	
	public int getSensor() {
		return sensor;
	}

	public int getValue() {
		return value;
	}
}