package condicionales;

import java.util.Scanner;

public class Condicionales2_IGV {

	public static void main(String[] args) {
		// 2. Realiza un programa que pida un número 
		// por teclado y nos indique si es par o impar.
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Escribe un numero:");
		num = input.nextInt();
		
		if(num % 2==0){
			//  % Si num es par, al hacer n%2 el resultado será 0, y si es impar el resultado será 1
			System.out.println(num + " es par");
		} else {
			System.out.println(num +" es impar");
		}

	}

}
