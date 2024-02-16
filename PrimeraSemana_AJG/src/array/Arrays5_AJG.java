package array;

public class Arrays5_AJG {
	public static void main(String[] args) {
//		5. Crea dos arrays, uno para mostrar n productos y otro para mostrar sus 
//		respectivos precios. Muestra en consola la lista de productos y sus precios. 
//		Por lo menos 5 productos o artículos
		
		  // Crear arrays para productos y precios
        String[] productos = {"Jabon", "Aceite", "Azucar", "Limon", "Sal"};
        double[] precios = {10.99, 20.49, 15.75, 8.95, 12.50};

        // Mostrar la lista de productos y sus precios
        System.out.println("Lista de productos y sus precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }
	}

}
