package condicionales;

import java.util.Scanner;

public class Condicionales7_JAVM {

	public static void main(String[] args) {
	/*
	 * 7. El director de una escuela est� organizando un viaje de estudios y requiere determinar cu�nto debe cobrar a cada alumno y 
	 * cu�nto debe pagar a la compa��a de viajes por el servicio. La forma de cobrar es la siguiente: 
	 * * Si son 100 alumnos o m�s, el costo por cada alumno es de 65 euros. * De 50 a 99 alumnos, el costo es de 70 euros. 
	 * * De 30 a 49 alumnos, el costo es de 95 euros. * Menos de 30 alumnos, el costo de la renta del autob�s es de 4000 euros, sin importar el n�mero de alumnos.
	 *  Realiza un algoritmo que permita determinar el pago a la compa��a de autobuses y lo que debe pagar cada alumno por el viaje.
	 */
		Scanner input = new Scanner (System.in);
		int numeroAlumnos;
		System.out.print("Introdusca el numero de alumnos para calcular el costo por alumno: ");
		numeroAlumnos = input.nextInt();
		
		 if (numeroAlumnos >= 100) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*65 + " "
		          + "pesos y cada alumno debe pagar 65 pesos");
		    } else if (numeroAlumnos <100 && numeroAlumnos >= 50) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*70 + " "
		          + "pesos y cada alumno debe pagar 70 pesos");
		    } else if (numeroAlumnos < 50 && numeroAlumnos >= 30) {
		      System.out.println("El pago a la agencia es de " + numeroAlumnos*95 + " "
		          + "pesos y cada alumno debe pagar 95 pesos");
		    } else {
		      System.out.println("El coste del autob�s es de 4000 pesos y cada alumno "
		          + "debe pagar " + (4000/numeroAlumnos) + " pesos.");
		

		}
	}

}
