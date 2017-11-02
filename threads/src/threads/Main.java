package threads;

public class Main {

	
	static Buffer buffer = new Buffer();
	static ThreadInput input;
	
	public static void main(String[] args) {   	
      
		input = new ThreadInput(buffer);
		
		input.run();
		
        if (buffer.hasUpdate()) {
        	Update u = buffer.getUpdate();
        	new Dashboard().updateSensor(u.getSensor(), u.getValue());
        }
	}
}
