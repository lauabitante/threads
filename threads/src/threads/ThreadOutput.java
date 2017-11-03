package threads;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadOutput implements Runnable {
	
	Buffer buffer;
	Dashboard dashboard;
	
	public ThreadOutput(Buffer buffer) {
		this.buffer = buffer;
		this.dashboard = new Dashboard();
	}
	
	public void run() {
		
		do {
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				Logger.getLogger(ThreadOutput.class.getName()).log(Level.SEVERE, null, e);
			}
			
			if (buffer.hasUpdate()) {
				Update u = buffer.getUpdate();
				dashboard.updateSensor(u.getSensor(), u.getValue());
			}
			
		} while (true);
	}	
}
