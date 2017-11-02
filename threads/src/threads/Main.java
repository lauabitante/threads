package threads;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
	    Scanner scan = new Scanner(System.in);
    	int  sensor;
    	int  valor;
    	
        System.out.print("Sensor: ");
        sensor = scan.nextInt();
        System.out.print("Valor: ");
        valor = scan.nextInt();
        
        new Dashboard().updateSensor(sensor, valor);

	}

}
