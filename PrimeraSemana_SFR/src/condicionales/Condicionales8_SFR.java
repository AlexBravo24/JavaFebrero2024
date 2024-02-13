package condicionales;

import java.util.Scanner;

public class Condicionales8_SFR {

	public static void main(String[] args) {
		
		
		// 8. Realiza un programa que pida por teclado el resultado (dato entero)
		//obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en
		//letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las
		//caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4.
		//Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se
		//mostrar� el mensaje: �ERROR: n�mero incorrecto�.
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el resultado obtenido al lanzar el dado (1-6): ");
	        int resultadoDado = scanner.nextInt();
	        scanner.close();

	        
	        if (resultadoDado < 1 || resultadoDado > 6) {
	            System.out.println("ERROR: n�mero incorrecto");
	        } else {
	           
	            String numeroOpuesto = obtenerNumeroOpuesto(resultadoDado);
	            System.out.println("El n�mero opuesto es: " + numeroOpuesto);
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
