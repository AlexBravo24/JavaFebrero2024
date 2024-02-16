package Condicionales;

import java.util.Scanner;

public class Condicionales1_JPS {

	public static void main(String[] args) {
		
		//Ejercicio 1 
		/*
		 * Realiza un programa que reciba dos números 
		 * por teclado e indique cuál es mayor o si son iguales.
		 */
		//Realizo programa para calcular el area de tuberias con solo el diametro 
		
		// Introducir valores por teclado
		
				//Primero declaramos la variable en la cual queremos 
				//guardar un valor
			
		//double diametro = ();
				
		
				 Scanner input = new Scanner(System.in);
				
				//Lo que tecleamos lo vamos a guardar en la variable diametro
				System.out.println("Introduce el diametro en cm de la tuberia uno");
				double diametro = input.nextDouble();
				
				
					
				//Una vez almacenado el valor de diametro, puedo hacer con 
				//ella lo ue necesite, una operacion,etc
				System.out.println("El diametro de la tuberia uno en cm es: " + (diametro));
				
				//Ahora necesito solicitar el diametro de tuberia
				//Podemos usar el mismo objeto Scaner
				System.out.println("Introduce el diametro en cm de la tuberia dos");
				double diametro2 = input.nextDouble();
				

				System.out.println("El diametro de la tuberia dos en cm es: " + (diametro2));
				
				System.out.println("Area de tuberia 2 : " + ((3.1416*((diametro2)*(diametro2)))/4));
				System.out.println("Area de tuberia 1 : " + ((3.1416*((diametro)*(diametro)))/4));
				
				System.out.println("Tuberia con mayor area : ");
				
				
                
				double t1 = ((3.1416*((diametro)*(diametro))/4));
				
				
				double t2 = ((3.1416*((diametro2)*(diametro2))/4));
				
				
				if(t1>t2){
					System.out.println("tuberia 1");
					
						}else {System.out.println(".");
					}
				if(t2>t1){
					System.out.println("tuberia 2");
					
						}else {System.out.println(".");
						
				
					}
				
				if(t1==t2){
					System.out.println("Son iguales");
						
				}else {System.out.println(" ");
				
}
				System.out.println("Fue un placer ayudarte");
									
	}

	   
	
	
}
					
				

				
						

					
				
				
				

		
	


