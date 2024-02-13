package condicionales;

import java.util.Scanner;

public class Condicionales9_DGM {

	public static void main(String[] args) {
		// 9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
		//correspondiente. Si introducimos otro número nos da un error.

 int Numero;
 
 Scanner Entrada = new Scanner(System.in);
 
   System.out.print("Digite en numero el dia de la semana: ");
   Numero = Entrada.nextInt();
   
  switch (Numero) {

          case 1: System.out.println("El Dia de la Semana es Lunes");
	      break;
          
          case 2: System.out.println("El Dia de la Semana es Martes");
	      break;
	      
          case 3: System.out.println("El Dia de la Semana es Miercoles");
	      break;
	      
          case 4: System.out.println("El Dia de la Semana es Jueves");
	      break; 
	      
          case 5: System.out.println("El Dia de la Semana es Viernes");
	      break;
	      
          case 6: System.out.println("El Dia de la Semana es Sabado");
	      break;
	      
          case 7: System.out.println("El Dia de la Semana es Domingo");
	      break;
	      
          default:System.out.println("Erro Digite un Numero del 1 al 7");
	      break;
	     
}
  
	}	
}
