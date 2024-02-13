package arrays;

public class Arrays5_JAM {

	public static void main(String[] args) {
		
		/*
		 * Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
		 * respectivos precios. 
		 * Muestra en consola la lista de productos y sus precios.
		 * Por lo menos 5 productos o artículos.
		 */
		
		String [] productos = {"Huevo","Leche","Pan","Queso","Jamón"};
		int [] precios = {7,15,8,14,18};
		
		for (int i = 0; i < productos.length; i++) {
			System.out.println(productos[i]+", precio:$ "+precios[i]);
		}
		
	}

}
