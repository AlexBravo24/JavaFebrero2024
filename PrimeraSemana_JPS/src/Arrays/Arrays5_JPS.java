package Arrays;

public class Arrays5_JPS {

	public static void main(String[] args) {
		
		//
//		Crea dos arrays, uno para mostrar n productos y otro para mostrar sus
//		respectivos precios. Muestra en consola la lista de productos y sus precios.
//		Por lo menos 5 productos o artículos.
		
        // Arrays de productos y precios
        String[] productos = {"Camiseta", "Pantalón", "Zapatos", "Reloj", "Gafas de sol"};
        double[] precios = {15.99, 29.99, 49.99, 99.99, 19.99};

        // Mostrar lista de productos y precios
        System.out.println("Lista de productos y precios:");
        for (int i = 0; i < productos.length; i++) {
            System.out.println(productos[i] + ": $" + precios[i]);
        }

	}

}
