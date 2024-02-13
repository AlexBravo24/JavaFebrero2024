package condicionales;

import java.util.Scanner;

public class Condicionales3_JUMP {
	
	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos 
		//números y muestre el resultado de su división. 
		//Si el segundo número es 0, debe mostrar un mensaje de error.
		
		Scanner scanner = new Scanner (System.in);
	    double num1, num2;
	    System.out.print("Introduce el primer número: ");
	    num1 = scanner.nextDouble();
	    System.out.print("Introduce el segundo número: ");
	    num2 = scanner.nextDouble();
	    
	 
	    
		if (num2 == 0) {
			System.out.println("Error");
		}else {
			System.out.println("Resultado = "+ (num1/num2));
		}
	    
	    } 
		
	}


