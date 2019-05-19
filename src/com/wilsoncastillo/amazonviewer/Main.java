package com.wilsoncastillo.amazonviewer;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int exit = 1;
		
		do {
			
			
			
			System.out.println("BIENENIDOS AMAZON VIEWER");
			System.out.println();
			System.out.println("1. Movies");
			System.out.println("2. Series");
			System.out.println("3. Books");
			System.out.println("4. Magazines");
			System.out.println("0. Exit");
			System.out.println();
			
			System.out.println("Seleccione el número de la opcion deseada ");
			Scanner sc = new Scanner(System.in);
			int entrada = sc.nextInt();
			
			switch (entrada) {
				case 1:
					System.out.println("Entrada Movies");
					break;
				case 2:
					System.out.println("Entrada Series");
					break;
				case 3:
					System.out.println("Entrada Books");
					break;
				case 4:
					System.out.println("Entrada Magazines");
					break;
				case 5:
					System.out.println("Entrada mivies");
					break;
				case 0:
					exit = 0;
					break;
				default:
					System.out.println("Opción invalidad...");
					break;
			}
			
		}while(exit !=0);
		
	}

}

