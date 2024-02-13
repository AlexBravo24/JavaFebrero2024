package arrays;

import java.util.Scanner;

public class Arrays5_SFR {

	public static void main(String[] args) {
	
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		//respectivos precios. Muestra en consola la lista de productos y sus precios.
		//Por lo menos 5 productos o artículos.
          
		 Scanner  input = new Scanner(System.in);
	     String[] productos = {"Producto 1", "Producto 2", "Producto 3", "Producto 4", "Producto 5"};
	        double[] precios = {10.50, 20.25, 15.75, 30.00, 12.99};

	        // Mostrar la lista de productos y precios
	        System.out.println("Lista de productos y precios:");
	        for (int i = 0; i < productos.length; i++) {
	            System.out.println(productos[i] + ": $" + precios[i]);
	        }
		 
	}

}
