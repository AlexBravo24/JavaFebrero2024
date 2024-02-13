package curso;

import java.util.Scanner;

public class EntradaDatos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edad;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce tu edad");
		edad = input.nextInt();
		
		System.out.println("Tu edad es:" + edad);
		
		System.out.println("Introduce tu estatura: ");
		double est = input.nextDouble();
		
		System.out.println("Tu estatura es:" + est);
	}

}
