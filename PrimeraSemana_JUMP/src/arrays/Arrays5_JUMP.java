package arrays;

import java.util.Scanner;

public class Arrays5_JUMP {

	public static void main(String[] args) {
		
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		  String [] productos = {"Lapiz","Goma","Lapicero","Colores","Regla"};
		    double [] precio = {5,3,6,69,22};
		    Scanner sc=new Scanner(System.in);
		    System.out.println("Introduce el nombre del producto: ");
		    String producto=sc.nextLine();
		    for (int i=0;i<5;i++){
		        if(productos[i].equals(producto)){
		            System.out.println("El producto "+producto+" tiene un precio de: $ "+precio[i]);
		            }
		        }

	}

}
