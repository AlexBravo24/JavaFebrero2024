package arrays;

import java.util.Scanner;

public class Array4_DGM {

	public static void main(String[] args) {
		// 4
		
	String [] productos = new String [5];
	Double [] precios = new Double [5];
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.println("Digite los 5 productos");
	for ( int i = 0; i < 5; i++) {
		System.out.print("Digite el producto N°"+(i+1)+":");
		productos [i] = entrada.nextLine();
	
	}
	System.out.println();
	System.out.println("Digite el precio de los productos");
	for ( int i = 0;  i < 5; i++) {
		System.out.print("El precio del producto N°"+(i+1)+ " es de :$");
		precios [i] = entrada.nextDouble();
	}
	System.out.println();
	System.out.println("La lista de productos es :");
    for ( int i = 0; i < 5; i++) {
	    System.out.println((i+1)+ ".-" +productos[i]+ " : $" +precios[i]);
    }
	}

}
