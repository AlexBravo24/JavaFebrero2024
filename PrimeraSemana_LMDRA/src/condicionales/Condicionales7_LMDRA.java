package condicionales;

import java.util.Scanner;

public class Condicionales7_LMDRA {

	public static void main(String[] args) {
		//Se declaran las variables que serán utilizadas
		
		double nAlumnos,costoAlumno,costoRenta;
		Scanner input = new Scanner(System.in);
		System.out.println("Calculadora de pago por alumno");
		System.out.println("Ingrese el número de alumnos");
		nAlumnos=input.nextInt();
		costoAlumno = 0;
		//Con un if se declaran los posibles numero de alumos o casos en los que el precio cambiaria
		if (nAlumnos>=100) {
			costoAlumno=65;
		}else if(nAlumnos>=50 && nAlumnos<= 99) {
			costoAlumno=70;
		}else if(nAlumnos>=30 && nAlumnos<= 49) {
			costoAlumno=95;
		}else if(nAlumnos<=30 && nAlumnos>=1) {
			costoAlumno=4000/nAlumnos;
		}else {
			System.out.println("No es posible hacer una cotización");
		
		}
		//Se realiza una operacion para conocer cuanto se debera pagar 
		costoRenta= nAlumnos * costoAlumno;	
		System.out.println("El costo para la compañía de autobuses es de: " + costoRenta + " euros.");
	    System.out.println("Cada alumno debe pagar: " + costoAlumno + " euros.");
	}

}
