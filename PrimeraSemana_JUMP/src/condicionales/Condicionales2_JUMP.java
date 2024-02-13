package condicionales;

import java.util.Scanner;

public class Condicionales2_JUMP {

	public static void main(String[] args) {
		
		// 2.Realiza un programa que pida un número por 
		//teclado y nos indique si es par o impar.

		 Scanner scanner = new Scanner (System.in);
		    int numero;
		    System.out.print("Introduce el número: ");
		    numero = scanner.nextInt();
		    
		    if (numero % 2 == 0){
		        System.out.println("El numero: " +numero + " es par.");
		    }else {
		        System.out.println("El numero: " +numero + " es impar.");
		    }  
		  }
		

	}


