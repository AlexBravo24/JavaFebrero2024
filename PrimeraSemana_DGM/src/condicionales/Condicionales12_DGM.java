package condicionales;

import java.util.Scanner;

public class Condicionales12_DGM {

	public static void main(String[] args) {
		//Calcular IMC
		
	int peso;
	double altura;
	double imc;
	String nombre;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite el nombre del paciente: ");
	nombre = entrada.nextLine();
	
	System.out.print("Digite el peso del paciente "+nombre+" en kg :");
	peso = entrada.nextInt();
	
	System.out.print("Digite la altura del paciente "+nombre+" en metros :");
    altura = entrada.nextDouble();
    altura = Math.pow(altura, 2);
    
    imc = peso  / altura;
    System.out.println("El indice de masa de" +nombre+ "es: " +imc);
    
    if (imc < 16) {
        System.out.println("Criterio de ingreso en hopital");
    }
    else if (imc >= 16 && imc<= 17) {
        System.out.println("infrapeso");
    }
    else if (imc == 18) {
        System.out.println("bajo peso");
    }
    else if (imc > 18 && imc<= 25) {
        System.out.println("peso normal (saludable)");
    }
    else if (imc > 25 && imc<= 30) {
        System.out.println("sobrepeso (obecidd grado 1)");
    }
    else if (imc > 30 && imc<= 35) {
        System.out.println("sobrepeso cronico (obecidd grado 2)");
    }
    else if (imc > 35 && imc<= 40) {
        System.out.println("obecidad premorbida (obecidd grado 3)");
    }
    else {
    System.out.println("obesidad morbida (obecidad de grado 4)");
    }
    }
}

