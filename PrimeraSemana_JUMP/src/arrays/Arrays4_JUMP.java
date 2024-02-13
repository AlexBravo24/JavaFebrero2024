package arrays;

import java.util.Scanner;

public class Arrays4_JUMP {

public static void main(String[] args) {
		
		// 4. Dado un array de números de 5 posiciones con los siguientes valores:
	//{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
	//los valores invertidos, es decir, que el segundo array deberá tener los valores 
	//{5,4,3,2,1}.
	
	int arr[] = new int [5];
	Scanner sc = new Scanner(System.in);
	for (int i=0; i<arr.length;i++) {
		
		System.out.println("Introduce un numero: ");
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Los numeros en orden inverso son: ");
	int j=4;
	while (j>=0) {
		System.out.println();
		System.out.println("|"+arr[j]+"|\n");
		j--;
	}
	
	

	}
}
