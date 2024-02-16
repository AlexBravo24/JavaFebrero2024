package condicionales;

import java.util.Scanner;

public class Condicionales10_SFR {

	public static void main(String[] args) {
		
		
		//10.Realiza un programa que pida un número entero entre uno y doce e imprima
		//el número de días que tiene el mes correspondiente.
		
		Scanner input = new Scanner(System.in);
		 System.out.print("Ingrese un número entero entre 1 y 12: ");
	        int numeroMes = input.nextInt();
	        int diasMes = 0;
	        switch (numeroMes) {
	            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
	                diasMes = 31;
	                break;
	            case 4: case 6: case 9: case 11:
	                diasMes = 30;
	                break;
	            case 2:
	                diasMes = 28; 
	                break;
	            default:
	                System.out.println("Número de mes no válido.");
	                break;
	        }
	        
	        if (diasMes > 0) {
	            System.out.println("El mes " + numeroMes + " tiene " + diasMes + " días.");
	        }
		
	}

}
