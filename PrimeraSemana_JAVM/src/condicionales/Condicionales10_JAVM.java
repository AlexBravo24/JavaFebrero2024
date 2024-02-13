package condicionales;

import java.util.Scanner;

public class Condicionales10_JAVM {

	public static void main(String[] args) {
		// 10.Realiza un programa que pida un número entero entre uno y doce e imprima el número de días que tiene el mes correspondiente.

		Scanner input = new Scanner (System.in);
		int NumeroDeMes;
		System.out.println("Digita el numero de mes para saber los dias que tiene ");
	   NumeroDeMes = input.nextInt();
	   switch (NumeroDeMes) {
	    case 1:
	      System.out.println("Enero tiene 30 dias.");
	      break;
	    case 2:
	      System.out.println("Febrero tiene 28 dias y 29 dias si es bisiesto");
	      break;
	    case 3:
	      System.out.println("Marzo tiene 30 dias");
	      break;
	    case 4:
	      System.out.println("Abrir tiene 31 dias");
	      break;
	    case 5:
	      System.out.println("Mayo tiene 30 dias");
	      break;
	    case 6:
	      System.out.println("Junio tiene 31 dias");
	      break;
	    case 7:
		      System.out.println("Julio tiene 30 dias");
		      break;
	    case 8:
		      System.out.println("Agosto tiene 31 dias");
		      break;
	    case 9:
		      System.out.println("Septiembre tiene 30 dias");
		      break;
	    case 10:
		      System.out.println("Octubre tiene 31 dias");
		      break;
	    case 11:
		      System.out.println("Noviembre tiene 30 dias");
		      break;
	    case 12:
		      System.out.println("Diciembre tiene 31 dias");
		      break;
	    default:
	      System.out.println("ERROR: Solo existen 12 meses");
	}

 }
}