package condicionales;

import java.util.Scanner;

public class Condicionales5_JAVM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
	    int nota;
	    int edad;
	    String sexo;
	    System.out.println("Se calculara la aceptacion de acuerdo con base a los siguientes parametros:");
	        System.out.print("Edad: ");
	        edad = scanner.nextInt();
	        System.out.print("Nota: ");
	        nota = scanner.nextInt(); scanner.nextLine();
	        System.out.print("Sexo (M o F): ");
	        sexo = scanner.nextLine();
	        if (!sexo.equals("M") && !sexo.toUpperCase().equals("F")) {
	            System.out.println("El valor de sexo introducido es incorrecto."
	                + "por favor, reenvíe el formulario.");
	            
	          
	} else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("M"))) {
	      System.out.println("POSIBLE");
	    }else if ((nota >= 5) && (edad >= 18) && (sexo.toUpperCase().equals("F"))) {
	       System.out.println("ACEPTADA");
	    }else {
	        System.out.println("NO ACEPTADA");
	    }

	       
	}
}
