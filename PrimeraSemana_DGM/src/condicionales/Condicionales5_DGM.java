package condicionales;

import java.util.Scanner;

public class Condicionales5_DGM {

	

	public static void main(String[] args) {
		// 5. Realiza un programa que calcule la aceptación de una solicitud en base a 
		//los siguientes parámetros: edad, nota y sexo.

	int Edad;
	int Nota;
	char Sexo;
	
	Scanner Entrada = new Scanner(System.in);
	
	System.out.print("Digite la Nota: ");
	Nota = Entrada.nextInt();
	
	System.out.print("Digite la Edad: ");
	Edad = Entrada.nextInt();
	
	System.out.print("Digite el M o F segun sea el Sexo:\n"
			+ "M.- Masculino\n"
			+ "F.- Femenino\n"
			+ ": ");
	Sexo = Entrada.next().charAt(0);

	if (Nota == 5 && Edad == 18 && Sexo == 'M'){
		System.out.println("Estado de la Solicitud: POSIBLE");
	}
	else if (Nota == 5 && Edad == 18 && Sexo == 'F') {
		System.out.println("Estado de la Solicitud: ACEPTADA");
	}
	else if(Sexo == 'm'){
		System.out.println("Digite la Letra en Mayuscula");
	}
	else if(Sexo == 'f'){
		System.out.println("Digite la Letra en Mayuscula");
	}
	else {
		System.out.println("NO ACEPTADA");
	}
	}
}
