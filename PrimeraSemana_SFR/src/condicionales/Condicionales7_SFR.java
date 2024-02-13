package condicionales;

import java.util.Scanner;

public class Condicionales7_SFR {

	public static void main(String[] args) {
		
		
		// 7. El director de una escuela está organizando un viaje de estudios y requiere
		//determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la
		//compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son
		//100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99
		//alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95
		//euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000
		//euros, sin importar el número de alumnos. Realiza un algoritmo que permita
		//determinar el pago a la compañía de autobuses y lo que debe pagar cada
		//alumno por el viaje.
		
		Scanner input = new Scanner(System.in);
		
		  int cantidadAlumnos;
	        double costoPorAlumno;
	        double costoTotalAlumnos;
	        double costoTotalAutobus;
		
       
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidadAlumnos = input.nextInt();
        input.close();

      
        if (cantidadAlumnos >= 100) {
            costoPorAlumno = 65.0;
        } else if (cantidadAlumnos >= 50 && cantidadAlumnos <= 99) {
            costoPorAlumno = 70.0;
        } else if (cantidadAlumnos >= 30 && cantidadAlumnos <= 49) {
            costoPorAlumno = 95.0;
        } else {
            costoPorAlumno = 4000.0 / cantidadAlumnos;
        }
        costoTotalAlumnos = costoPorAlumno * cantidadAlumnos;

       
        if (cantidadAlumnos < 30) {
            costoTotalAutobus = 4000.0;
        } else {
            costoTotalAutobus = costoTotalAlumnos;
        }

        
        System.out.println("El costo por alumno es: " + costoPorAlumno + " euros.");
        System.out.println("El costo total para los alumnos es: " + costoTotalAlumnos + " euros.");
        System.out.println("El pago a la compañía de autobuses es: " + costoTotalAutobus + " euros.");
	
		
	}

}
