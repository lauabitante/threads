package threads;

public class Main {

	
	static Buffer buffer = new Buffer();
	static ThreadInput input;
	static ThreadOutput output;
	
	public static void main(String[] args) {   	
		input  = new ThreadInput(buffer);
		output = new ThreadOutput(buffer);
		
		new Thread(input).start();
		new Thread(output).start();
	}
}
