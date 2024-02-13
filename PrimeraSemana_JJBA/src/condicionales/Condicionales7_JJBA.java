package condicionales;

import java.util.Scanner;

public class Condicionales7_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio7 - El director de una escuela está organizando un viaje de estudios y requiere 
//		determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//		compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//		100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//		alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//		euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//		euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//		determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//		alumno por el viaje.
		
		int Alumnos;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el número de alumnos");
		Alumnos = input.nextInt();
		
		
		if (Alumnos >= 100 ) {
			System.out.println("Costo pot alumno: 65 euros.");
		}else if (Alumnos >= 50 && Alumnos <=99 ) {
			System.out.println("Costo por alumno: 70 euros.");
		}else if (Alumnos >= 30 && Alumnos <=49 ) {
			System.out.println("Costo por alumno: 95 euros.");
		}else {
			System.out.println("Costo por alumno: " + ( 4000 / Alumnos ));
		
		}	
	}

}
