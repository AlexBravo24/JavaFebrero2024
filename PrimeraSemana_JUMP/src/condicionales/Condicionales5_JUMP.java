package condicionales;

import java.util.Scanner;

public class Condicionales5_JUMP {

	public static void main(String[] args) {
		
		// 5. Realiza un programa que calcule la aceptación 
		//de una solicitud en base a los siguientes parámetros: 
		//edad, nota y sexo. 
		//* Mínimo: Nota (5), edad (18), sexo M -> POSIBLE 
		//* Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA 
		//* Otros casos -> NO ACEPTADA
		
		Scanner scanner = new Scanner(System.in);
	    int nota;
	    int edad;
	    String sexo;

	    System.out.print("Ingresa edad: ");
	    edad = scanner.nextInt();
	    System.out.print("Ingresa la nota: ");
	    nota = scanner.nextInt(); scanner.nextLine();
	    System.out.print("Ingreso el sexo con (M o F): ");
	    sexo = scanner.nextLine();
	    
	    if (!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
	      System.out.println("Reinicia el formulario, ingresa el sexo con la letra 'F' o 'M'");
	    } else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("Solicitud 'ACEPTADA'");
	    }else {
	        System.out.println("Solicitud 'NO ACEPTADA'");
	    }

	}

}
