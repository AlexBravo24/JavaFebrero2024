package Condicionales;

import java.util.Scanner;

public class Condicionales7_JPS {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		/*
		 * 7. El director de una escuela está organizando 
		 * un viaje de estudios y requiere determinar cuánto
		 * debe cobrar a cada alumno y cuánto debe pagar a la compañía de viajes por el servicio. La forma de
		 * cobrar es la siguiente:
		 * *Si son 100 alumnos o más, el costo por cada alumno es de 65 euros. 
		 * De 50 a 99 alumnos, el costo es de 70 euros.
		 *De 30 a 49 alumnos, el costo es de 95 euros.
		 *Menos de 30 alumnos, el costo de la renta del autobús es de 4000 euros, sin importar el número de alumnos.
		 *Realiza un algoritmo que permita determinar el pago a la compañía de autobuses y lo que debe
		 *pagar cada alumno por el viaje.
		 */
		
		//INICIAMOS DECLARANDO NUESTRAS VARIABLES PARA ALMACENAR DATOS
		int nalumnos;
		int transporte=(4000);
	

		//Declarar una variable de la clase Scanner 
		
		Scanner input = new Scanner(System.in);
		//Lo que escribamos lo pondremos en la variable tipo
		System.out.println("Introduce el numero de alumnos que asisten");
		nalumnos = input.nextInt();
		
		
		System.out.println("El total a pagar es de $ :" );
		
        //65 PESOS CADA UNO SI SON MAS DE CIEN ALUMNOS
//       int A50_100=70;//cada u de entre 50 a 100 alumnos
//       int A30_49=95;//cada uno si son entre 30 a 49 alumnos
//       int A_30=(transporte);//si van menos de 30
    
        int b=(nalumnos); 
		
		int x =(b);
		int z=100;
		int w=50;
		int t=30;
		int e=95;
		int q=65;
		int p=70;
		int k=95;
		
		if(x>e) {
			System.out.println("Costo total :" + (x*q));
		}else {
			System.out.println(" ");
		}

		if(x>w||x<z) {
			System.out.println("R : " + (x*p));
		}else {
			System.out.println(" ");
		}

		if(x>w&&x<t) {
			System.out.println("R : " + (x*k));
		}else {
			System.out.println(" ");
		}
		if(x>t) {
			System.out.println("R : " + (transporte));
		}else {
			System.out.println(" ");
		}

		}
}

