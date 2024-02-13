package condicionales;

import java.util.Scanner;

public class Condicionales10_SFR {

	public static void main(String[] args) {
		
		
		//10.Realiza un programa que pida un n�mero entero entre uno y doce e imprima
		//el n�mero de d�as que tiene el mes correspondiente.
		
		Scanner input = new Scanner(System.in);
		 System.out.print("Ingrese un n�mero entero entre 1 y 12: ");
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
	                System.out.println("N�mero de mes no v�lido.");
	                break;
	        }
	        
	        if (diasMes > 0) {
	            System.out.println("El mes " + numeroMes + " tiene " + diasMes + " d�as.");
	        }
		
	}

}
