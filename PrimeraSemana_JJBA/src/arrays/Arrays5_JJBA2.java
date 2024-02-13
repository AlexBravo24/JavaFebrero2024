package arrays;

public class Arrays5_JJBA2 {

	public static void main(String[] args) {
		
		//Ejercicio5 - Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos
		
		Object [] productos = {"Manzana", "Naranja", "Limón", "Lima", "Toronja"} ;
		Object [] precio = {10,20,30,40,50};
		
		for (int i = 0; i < productos.length; i++) {
			System.out.printf(productos[i]+ ": $"+ precio[i]+" ");
			
		}
			

	}

}
