package condicionales;

import java.util.Scanner;

public class Condicionales8_AJG {
    
    public static void main(String[] args) {
//    	8. Realiza un programa que pida por teclado el resultado (dato entero) 
//    	obtenido al lanzar un dado de seis caras y muestre por pantalla el n�mero en 
//    	letras (dato cadena) de la cara opuesta al resultado obtenido. Nota 1: En las 
//    	caras opuestas de un dado de seis caras est�n los n�meros: 1-6, 2-5 y 3-4. 
//    	Nota 2: Si el n�mero del dado introducido es menor que 1 o mayor que 6, se 
//    	mostrar� el mensaje: �ERROR: n�mero incorrecto�.
//    	
        int caraDado;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce La Cara del Dado");
        caraDado = input.nextInt();
        
        if (caraDado >= 1 && caraDado <= 6) {
            switch (caraDado) {
                case 1:
                    System.out.println("Seis");
                    break;
                case 2:
                    System.out.println("Cinco");
                    break;
                case 3:
                    System.out.println("Cuatro");
                    break;
                case 4:
                    System.out.println("Tres");
                    break;
                case 5:
                    System.out.println("Dos");
                    break;
                case 6:
                    System.out.println("Uno");
                    break;
            }
        } else {
            System.out.println("ERROR: n�mero incorrecto");
        }
        
    }
}
