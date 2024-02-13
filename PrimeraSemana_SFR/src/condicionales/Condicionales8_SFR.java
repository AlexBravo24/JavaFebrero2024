package condicionales;

import java.util.Scanner;

public class Condicionales8_SFR {

	public static void main(String[] args) {
		
		
		// 8. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el número en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras están los números: 1-6, 2-5 y 3-4.
		//Nota 2: Si el número del dado introducido es menor que 1 o mayor que 6, se
		//mostrará el mensaje: “ERROR: número incorrecto”.
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el resultado obtenido al lanzar el dado (1-6): ");
	        int resultadoDado = scanner.nextInt();
	        scanner.close();

	        
	        if (resultadoDado < 1 || resultadoDado > 6) {
	            System.out.println("ERROR: número incorrecto");
	        } else {
	           
	            String numeroOpuesto = obtenerNumeroOpuesto(resultadoDado);
	            System.out.println("El número opuesto es: " + numeroOpuesto);
	        }
	    }

	    
	    public static String obtenerNumeroOpuesto(int resultadoDado) {
	        String numeroOpuesto = "";
	        switch (resultadoDado) {
	            case 1:
	                numeroOpuesto = "Seis";
	                break;
	            case 2:
	                numeroOpuesto = "Cinco";
	                break;
	            case 3:
	                numeroOpuesto = "Cuatro";
	                break;
	            case 4:
	                numeroOpuesto = "Tres";
	                break;
	            case 5:
	                numeroOpuesto = "Dos";
	                break;
	            case 6:
	                numeroOpuesto = "Uno";
	                break;
	        }
	        return numeroOpuesto;

	}

}
