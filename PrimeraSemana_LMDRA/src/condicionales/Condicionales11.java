package condicionales;

import java.util.Scanner;

public class Condicionales11 {
	//Identificar el costo del traslado de un paquete
	public static void main(String[] args) {
		//Se declaran las variables que se van a utilizar
		int  region;
		double peso, costPeso,costoTotal;
		Scanner input = new Scanner(System.in);
		System.out.println("Calculemos el costo por el traslado del paquete");
		//Se solicita el peso del paquete para ver si se puede realizar el transporte
		System.out.println("Introduce el peso del paquete");
		peso=input.nextDouble();
		//Se realiza la evaluacion del peso para tomar accion
		if (peso>5) {
			System.out.println("No es posible transportar este paquete");
		}else if(0<peso && peso<=5) {
			 
			System.out.println("Introduce el n�mero de la regi�n en la que ser� transportado el paquete");
			System.out.println("1. Am�rica del norte");
	        System.out.println("2. Am�rica central");
	        System.out.println("3. Am�rica del sur");
	        System.out.println("4. Europa");
	        System.out.println("5. As�a");
	      //Se pregunta por la region donde sera el traslado para establecer el precio
	        region=input.nextInt();
			switch (region) {
			case 1:
				costPeso=24;
				break;
				
			case 2:
				costPeso=20;
				break;
					
			case 3:
				costPeso=21;	
				break;
						
			case 4:
				costPeso=10;		
				break;
							
			case 5:
				costPeso=18;			
				break;

			default:
				System.out.println("No es posible realizar esa consulta");
				return;
			}
			//se realiza el calculo 
			costoTotal=peso*costPeso;
			System.out.println("El costo por hacer el transporte en la regi�n "+region);
			System.out.println("es: "+ costoTotal+" euros");
		}
	}

}
