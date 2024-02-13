package condicionales;

import java.util.Scanner;

public class Condicionales9_JAVM {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día correspondiente. Si introducimos otro número nos da un error.
		Scanner input = new Scanner (System.in);
		int DiaDeLaSemana;
		System.out.print("que numero de dia de la semana es hoy ");
	   DiaDeLaSemana = input.nextInt();
	   switch (DiaDeLaSemana) {
	    case 1:
	      System.out.println("Hoy es lunes.");
	      break;
	    case 2:
	      System.out.println("Hoy es martes");
	      break;
	    case 3:
	      System.out.println("Hoy es miercoles");
	      break;
	    case 4:
	      System.out.println("Hoy es jueves");
	      break;
	    case 5:
	      System.out.println("Hoy es viernes");
	      break;
	    case 6:
	      System.out.println("Hoy es sabado");
	      break;
	    case 7:
		      System.out.println("Hoy es domingo");
		      break;
	    default:
	      System.out.println("ERROR: Solo existen 7 dias de la semana");
	}

 }
}
