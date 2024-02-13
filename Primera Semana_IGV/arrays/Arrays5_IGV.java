package arrays;

public class Arrays5_IGV {

	public static void main(String[] args) {
		// 5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
		//respectivos precios. Muestra en consola la lista de productos y sus precios. 
		//Por lo menos 5 productos o artículos.
		
		String [] productos = {"calcetas", "leche", "pan", "arroz", "jabon"}; 
		int [] precio = {50, 15, 40, 10, 45};
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println("El precio de: " + productos[i] + " es: " + precio[i]);
		}

	}

}
