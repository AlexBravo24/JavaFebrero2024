package ciclos;

import java.util.Scanner;

public class Ciclos2_LMDRA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabla,maxN,serie;
		serie=1;
		System.out.println("Introduce el n�mero del cual deseas conocer sus m�ltiplos");
		tabla=input.nextInt();
		System.out.println("Introduce el n�mero de hasta que m�ltiplo deseas conocer");
		maxN=input.nextInt();
		
		for (int i=1;i<=maxN;i++) {
			System.out.println(serie+" x "+tabla+" = "+(tabla*serie));
			serie++;
		}
	}

}
