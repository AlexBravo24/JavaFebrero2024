package arrays;

public class Arrays2_IGV {

	public static void main(String[] args) {
		// Crea un array de números de 100 posiciones, que contendrá los números del 
		// 1 al 100. Obtén la suma de todos ellos y la media
		
		int [] array = new int [100];
		int cuenta = 0;
		double media = 0;
			for (int i = 0; i < array.length; i++) {
				array[i] = i + 1;
				cuenta = cuenta + array[i];
				System.out.println(array[i]);
				
				if (i == 99) {
					System.out.println("El total es:" + cuenta);
					media = cuenta / (100);
					System.out.println("La media es: "+ media);
					
				}
	
		} 

	}

}
