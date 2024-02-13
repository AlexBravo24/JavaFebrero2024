package ciclos;

import java.util.Scanner;

public class Ciclos1_SFR {

	public static void main(String[] args) {
		// 1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("ingrese el numero  " );
		
	  int Mul = input.nextInt();
		  
		int resul;
		for ( resul = 1; resul <= 10; resul++) {
			System.out.println(Mul +"X"+ resul+ "=" + Mul * resul);
			
			
		}
		
		
		
		
	}

}
