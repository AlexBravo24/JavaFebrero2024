package condicionales;

import java.util.Scanner;

public class Condicionales8_LMDRA {
	//Escribir con letra la cara opuesta del numero que salga en el dado
	public static void main(String[] args) {
		//Se declaran las variables que seran utilizadas
		String caraOpuestaDado;
		int numeroIngresado;
		Scanner input = new Scanner(System.in);
		// Se solicita el numero que salio en el dado
		System.out.println("Veamos la cara opuesta");
		System.out.println("Ingresa en número el valor del dado que salió");
		numeroIngresado = input.nextInt();
		
		 switch(numeroIngresado) {
         case 1:
             caraOpuestaDado = "Seis";
             break;
         case 2:
             caraOpuestaDado = "Cinco";
             break;
         case 3:
             caraOpuestaDado = "Cuatro";
             break;
         case 4:
             caraOpuestaDado = "Tres";
             break;
         case 5:
             caraOpuestaDado = "Dos";
             break;
         case 6:
             caraOpuestaDado = "Uno";
             break;
         default:
             System.out.println("ERROR: número incorrecto");
             
             
            return;
		 	}
		 System.out.println("El numero de la cara opuesta a la que te salió es "+caraOpuestaDado);
	}
}
