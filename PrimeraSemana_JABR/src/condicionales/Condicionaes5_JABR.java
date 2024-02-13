package condicionales;

import java.util.Scanner;

public class Condicionaes5_JABR {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declarar las variables donde recibiremos
		//la nota, edad y sexo
		
		int nota;
		int edad;
		String sexo;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce el valor de la nota");
		nota = input.nextInt();
		System.out.println("Introduce el valor de la edad");
		edad = input.nextInt();
		System.out.println("Ingresa el sexo M o F");
		sexo= input.next();
		
		//Evaluar las condiciones solicitadas
		
		if (nota >=5 && edad >=18 && sexo.equalsIgnoreCase("M")) {
			System.out.println("POSIBLE");
		}else if (nota >=5 && edad >=18 && sexo.equalsIgnoreCase("F")) {
			System.out.println("ACEPTADA");
		}else {
			System.out.println("NO ACEPTADA");
		}

	}

}
