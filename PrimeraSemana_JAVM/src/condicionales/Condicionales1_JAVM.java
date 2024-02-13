package condicionales;

import java.util.Scanner;

public class Condicionales1_JAVM {

	public static void main(String[] args) {
		// 1.Realiza un programa que reciba dos números por teclado e indique cuál es mayor o si son iguales
		
		Scanner input = new Scanner (System.in);
		System.out.println("Introduce un numero");
		int numero1 =  input.nextInt();
		System.out.println("Introduce un segundo numero");
		int numero2 =  input.nextInt();
		
		if(numero1 > numero2) {
			System.out.println(numero1+ "es mayor que" + numero2);
		} else if (numero2>numero1) {
			System.out.println(numero2 +"es mayor que"+ numero1);
		}else {
			System.out.println("los numero son iguales");
		}
		}
		}

	

