package condicionales;

import java.util.Scanner;

public class Condicionales5_LMDRA {
	//Calculo de aceptacion de una solicitud
	public static void main(String[] args) {
		
		//Declaramos las variables que seran utilizadas
		int nota, edad;
		char sexo;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Verifiquemos la aceptación de la solicitud");
		System.out.println("Ingrese los siguientes datos solicitados");
		System.out.println("Nota");
		nota=input.nextInt();
		System.out.println("Edad");
		edad=input.nextInt();
		System.out.println("Sexo Masculino(M)-Femenino(F)");
		sexo=input.next().toUpperCase().charAt(0);
		
		//Con un primer If verificamos si la nota y la edad son los minimos suficientes para pasar
		if (nota>=5 && edad>=18 && nota<=10) {
			//Posteriormente verificamos el genero para establecer si es posible pasar o si ya pasaron
			if(sexo=='M') {
				System.out.println("Es posible ser aceptado");
			}else if(sexo=='F') {
				System.out.println("Es aceptada");
			}else {
				//si el genero no coincide con alguna de las 2 anteriores significa que esta mal la solicitud
				System.out.println("Esta mal la solicitud que ingresó");
			}
		}else {//si no coincido la edad y la nota no son acepptados directamente 
			
			System.out.println("No será aceptado");
		}
	}

}
