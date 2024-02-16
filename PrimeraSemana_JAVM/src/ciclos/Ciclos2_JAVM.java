package ciclos;

import java.util.Scanner;

public class Ciclos2_JAVM {

	public static void main(String[] args) {
		/*2.- Programa un algoritmo que realice la tabla de multiplicar de un 
		 * numero introducido desde teclado, hasta la iteración deseada por el
		 *  usuario. Ejemplo, tabla de 23 hasta el 95. 23 x 95 = ???
		 * 
		 */
		Scanner input = new Scanner (System.in);
		System.out.print("Introduce un numero el cual se multiplicara hasta por 20: ");
		int numero;
		numero =  input.nextInt();
		for (  int i = 1; i <= 20; i++) {
			System.out.println(numero +"*"+i + "=" +(numero*i));
	}

}
}
