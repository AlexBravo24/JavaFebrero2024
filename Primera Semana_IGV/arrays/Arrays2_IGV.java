package arrays;

public class Arrays2_IGV {

	public static void main(String[] args) {
		// Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
		// 1 al 100. Obt�n la suma de todos ellos y la media
		
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
