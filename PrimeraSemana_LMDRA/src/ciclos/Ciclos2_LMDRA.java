package ciclos;

import java.util.Scanner;

public class Ciclos2_LMDRA {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int tabla,maxN,serie;
		serie=1;
		System.out.println("Introduce el número del cual deseas conocer sus múltiplos");
		tabla=input.nextInt();
		System.out.println("Introduce el número de hasta que múltiplo deseas conocer");
		maxN=input.nextInt();
		
		for (int i=1;i<=maxN;i++) {
			System.out.println(serie+" x "+tabla+" = "+(tabla*serie));
			serie++;
		}
	}

}
