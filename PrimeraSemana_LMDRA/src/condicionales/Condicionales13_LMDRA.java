package condicionales;

import java.util.Scanner;

public class Condicionales13_LMDRA {
	//Manejo del dinero de una institucion 
	public static void main(String[] args) {
		// Se declaran las variables necesarias para el funcionamiento
		double donacion,centroSalud,bolsa,comedor;
		Scanner input = new Scanner(System.in);
		
		//Se solicitan los datos a la institucion
		System.out.println("Calculemos como debe ser la reparticion");
		System.out.println("Ingrese el monto de la donación");
		donacion=input.nextDouble();
		
		 if (donacion >= 10000) {
	            centroSalud = donacion * 0.30;
	            comedor = donacion * 0.50;
	            bolsa = donacion - (centroSalud + comedor);
	        } else {
	            centroSalud = donacion * 0.25;
	            comedor = donacion * 0.60;
	            bolsa = donacion - (centroSalud + comedor);
	        }
		 System.out.println("De la donació de $"+donacion+", se repartira de la siguiente manera:");
		 System.out.println("El monto destinado al centro de salud: $" + centroSalud);
	     System.out.println("El monto destinado al comedor de niños: $" + comedor);
	     System.out.println("El monto destinado a la bolsa de valores: $" + bolsa);
		

	}

}
