package condicionales;

import java.util.Scanner;

public class Condicionales10_DGM {

	public static void main(String[] args) {
		//10.Realiza un programa que pida un número entero entre uno y doce e imprima 
		//el número de días que tiene el mes correspondiente
 
  int Numero;
   
  Scanner Entrada = new Scanner(System.in);
  
  System.out.println("¿Cuantos Dias tiene cada mes?");
  
  System.out.print("Digite el Numero del Mes del Año en Curso: ");
  Numero = Entrada.nextInt();
  
  switch (Numero) {

          case 1: System.out.println("El Mes de Enero tiene 31 Dias ");
	      break;
	      
          case 2: System.out.println("El Mes de Febrero tiene 29 Dias ");
	      break;
	      
          case 3: System.out.println("El Mes de Marzo tiene 31 Dias ");
	      break;
	      
          case 4: System.out.println("El Mes de Abril tiene 30 Dias ");
	      break;
	      
          case 5: System.out.println("El Mes de Mayo tiene 31 Dias ");
	      break;
	      
          case 6: System.out.println("El Mes de Junio tiene 30 Dias ");
	      break;
	      
          case 7: System.out.println("El Mes de Julio tiene 31 Dias ");
	      break;
	      
          case 8: System.out.println("El Mes de Agosto tiene 31 Dias ");
	      break;
          
          case 9: System.out.println("El Mes de Septiembre tiene 30 Dias ");
	      break;
	      
          case 10: System.out.println("El Mes de Octubre tiene 31 Dias ");
	      break;
	      
          case 11: System.out.println("El Mes de Noviembre tiene 30 Dias ");
	      break;

          case 12: System.out.println("El Mes de Diciembre tiene 31 Dias ");
	      break;
	      
          default: System.out.println("Error Digite un Numero Entre 1 y 12");
	      break;
}  
	}

}
