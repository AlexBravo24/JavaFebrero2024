package arrays;

import java.util.Scanner;

public class Arrays5_DEOR {

	public static void main(String[] args) {
		
		//5. Crea dos arrays, uno para mostrar n productos y otro para mostrar 
		//sus respectivos precios. Muestra en consola la lista de productos y 
		//sus precios. Por lo menos 5 productos o artículos.
		
		String [] productos = new String [5];
		int [] precios = new int [5];
		Scanner input = new Scanner (System.in);
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Introduce 1 nombre de productos");
			productos [i] = input.next();
			System.out.println("Introduce el precio del producto");
			precios [i] = input.nextInt();
		}		
		for (int i = 0; i < precios.length; i++) {
			System.out.println("Producto: " + productos[i] + "    Precio: " + precios[i]);
		}
	}
}
