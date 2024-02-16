package condicionales;

import java.util.Scanner;

public class Condicionales11_DGM {

	public static void main(String[] args) {
	
	double kilos;
	String ubicacion;
	double total;
	
	Scanner entrada = new Scanner(System.in);
	
	 System.out.println("Digite la ubicacion: ");
		ubicacion = entrada.nextLine().toUpperCase();//Lo pasa a MAYUSCULAS
	
	System.out.print("Digite el peso en (Kg) de su Paquete: ");
    kilos = entrada.nextDouble();
	
	
      if (ubicacion.equals("AMERICA DEL NORTE")) {
		       total = kilos * 24000;
		         System.out.println("El costo del envío es: $"+total);
	}
      else  if (ubicacion.equals("AMERICA CENTRAL")) {
     total = kilos * 20000;
       System.out.println("El costo del envío es: $"+total);
  }	
      else  if (ubicacion.equals("AMERICA DEL SUR")) {
    	     total = kilos * 21000;
    	       System.out.println("El costo del envío es: $"+total);
    	  }	
      else  if (ubicacion.equals("EUROPA")) {
 	     total = kilos * 10000;
 	       System.out.println("El costo del envío es: $"+total);
 	  }				
      else  if (ubicacion.equals("ASIA")) {
  	     total = kilos * 18000;
  	       System.out.println("El costo del envío es: $"+total);
  	  }	
      else {
    	  System.out.println("Digite un destino valido");
      }
	}
}
