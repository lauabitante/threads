package threads;

import java.util.Scanner;

public class ThreadInput extends Thread {

	Scanner scan = new Scanner(System.in);
	Buffer buffer;
	
	public ThreadInput(Buffer buffer) {
		this.buffer = buffer;
	}
	
	public void run() {
		int option;
		do {
			int sensor;
			int value;
			
			System.out.println();
			System.out.println("------------ Menu ------------ ");
			System.out.println("[1] Atualizar Sensor");
			System.out.println("[2] Sair");
			System.out.print("Opção: ");
			option = scan.nextInt();
			
			System.out.println();
			
			if (option == 1) {
				System.out.print("Sensor: ");
				sensor = scan.nextInt();
		        System.out.print("Valor: ");
		        value = scan.nextInt();
		        
		        Update update = new Update(sensor, value);
		        buffer.addUpdate(update);
			} else if (option != 2) {
				System.out.println("Opção inválida!");
			}
		} while (option != 2);
	}
}
