package threads;

import java.util.*;

public class Buffer {
	
	private List<Update> updates;
	
	public Buffer() {
		this.updates = new ArrayList<>();
	}
	
	public synchronized boolean hasUpdate() {
		return updates.size() > 0;
	}
	
	public synchronized void addUpdate(Update update) {
		this.updates.add(update);
	}

	public synchronized Update getUpdate() {
		if (this.hasUpdate()) {
			return updates.remove(0);
		} else {
			return null;	
		}
	}
}
