package condicionales;

import java.util.Scanner;

public class Condicionales7_AJG {

    public static void main(String[] args) {
//    	
//    	7. El director de una escuela está organizando un viaje de estudios y requiere 
//    	determinar cuánto debe cobrar a cada alumno y cuánto debe pagar a la 
//    	compañía de viajes por el servicio. La forma de cobrar es la siguiente: * Si son 
//    	100 alumnos o más, el costo por cada alumno es de 65 euros. * De 50 a 99 
//    	alumnos, el costo es de 70 euros. * De 30 a 49 alumnos, el costo es de 95 
//    	euros. * Menos de 30 alumnos, el costo de la renta del autobús es de 4000 
//    	euros, sin importar el número de alumnos. Realiza un algoritmo que permita 
//    	determinar el pago a la compañía de autobuses y lo que debe pagar cada 
//    	alumno por el viaje.
    	
        int alumnos;

        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de Alumnos");
        alumnos = input.nextInt();

        if (alumnos >= 100) {
            int costoPorAlumno = 65;
            int costoTotal = alumnos * costoPorAlumno;
            System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
            System.out.println("Pago a la compañía de autobuses: " + costoTotal + " euros");
        } else if (alumnos >= 50 && alumnos <= 99) {
            int costoPorAlumno = 70;
            int costoTotal = alumnos * costoPorAlumno;
            System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
            System.out.println("Pago a la compañía de autobuses: " + costoTotal + " euros");
        } else if (alumnos >= 30 && alumnos <= 49) {
            int costoPorAlumno = 95;
            int costoTotal = alumnos * costoPorAlumno;
            System.out.println("Costo por alumno: " + costoPorAlumno + " euros");
            System.out.println("Pago a la compañía de autobuses: " + costoTotal + " euros");
        } else {
            int costoTotal = 4000;
            System.out.println("Costo por alumno: " + costoTotal / alumnos + " euros");
            System.out.println("Pago a la compañía de autobuses: " + costoTotal + " euros");
        }
    }
}

