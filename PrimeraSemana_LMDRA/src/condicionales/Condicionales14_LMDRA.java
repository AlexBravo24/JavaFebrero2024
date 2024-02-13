package condicionales;

import java.util.Scanner;

public class Condicionales14_LMDRA {
	//Calculo de salario por horas trabajadas y horas extras
	public static void main(String[] args) {
		// Se declaran las variables necesarias para la ejecucion del programa 
		double hTrabajadas,pagoHoras,horasExtras,horasNormales,phNormal,phExtra;
		Scanner input = new Scanner(System.in);
		phNormal=16;
		phExtra=20;
		
		//Comienza preguntando por las horas trebajadas 
		System.out.println("Calculemos tú salario semanal");
		System.out.println("Introduce tu número de horas trabajadas esta semana");
		hTrabajadas= input.nextDouble();
		if (hTrabajadas<=40) {
			pagoHoras=hTrabajadas*phNormal;
			System.out.println("Tú salario semanal es de $"+pagoHoras+" por "+hTrabajadas+" horas de trabajo");
		}else if (hTrabajadas>40) {
			horasNormales=40;
			horasExtras=hTrabajadas-horasNormales;
			pagoHoras=(horasNormales*phNormal)+(horasExtras*phExtra);
			System.out.println("Tú salario semanal es de $"+pagoHoras+", $640"+
					" por "+horasNormales+" horas de trabajo"
					+" y $"+(phExtra*horasExtras)+" por "+horasExtras+" horas extras");
			
		}
		
	}

}
