package condicionales;

import java.util.Scanner;

public class Condicionales1_SFR {

	public static void main(String[] args) {
		
		
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es
		//mayor o si son iguales.
		
	
		Scanner input = new Scanner(System.in);
        System.out.println("Introduce un numero");
        double numero1 = input.nextDouble();
        System.out.println("Introduce otro numero");
        double numero2 = input.nextDouble();
        if (numero1>numero2) {
			System.out.println(numero1 + "es mayor a" + numero2);
	    }else if(numero2>numero1) { 
		System.out.println(numero2 +"es menor a" + numero1);
		}else {
			System.out.println("los numeros son iguales");
		}
        
		
		
		
		
	}

}
