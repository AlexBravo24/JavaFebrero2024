package arrays;

public class Arrays5_LMDRA {
	//Mostrar con 2 arreglos productos y precios
	public static void main(String[] args) {
		// Se declaran las variables 
		String []productos= {"leche","agua","arroz","queso","atun"};
		int [] preciosP= {28,16,17,35,21};
		 
		for (int i=0;i<productos.length;i++) {
			System.out.println("El precio del producto"
					+ " '"+productos[i]+"' es $"+preciosP[i]);
		}
	}

}
