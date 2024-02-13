package condicionales;

import java.util.Scanner;

public class Condicionales12_LMDRA {
	//Programa que calcula el IMC
	public static void main(String[] args) {
		//Se declaran las variables que seran utilizadas 
		double peso,altura,imc;
		Scanner input = new Scanner(System.in);
		//Se solicitan los datos al usuario
		System.out.println("Calculemos su IMC");
		System.out.println("Ingrese su altura en metros:");
		altura=input.nextDouble();
		System.out.println("Ingrese su peso en kilogramos:");
		peso=input.nextDouble();
		
		//Se realiza el calculo del imc
		imc = peso / (altura * altura);
		System.out.println("Su índice de masa corporal (IMC) es: " + imc);
		//de acuerdo con el resultado del imc se verifica en que condicion entra y se le envia
		//un mensaje al usuario
		if (imc < 16) {
            System.out.println("Criterio de ingreso en hospital");
        } else if (imc >= 16 && imc < 17) {
            System.out.println("Infrapeso");
        } else if (imc >= 17 && imc < 18) {
            System.out.println("Bajo peso");
        } else if (imc >= 18 && imc < 25) {
            System.out.println("Peso normal (Saludable)");
        }else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso(Obesidad grado I");
        }else if (imc >= 30 && imc < 35) {
            System.out.println("Sobrepeso crónico(Obesidad grado II");
        }else if (imc >= 35 && imc < 40) {
            System.out.println("Obesidad premórbida(Obesidad grado III");
        }else if (imc >40) {
            System.out.println("Obesidad mórbida(Obesidad grado IV");
        }
	}

}
