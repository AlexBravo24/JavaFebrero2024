package arrays;

public class Arrays2_JUMP {

	public static void main(String[] args) {
		
		// 2. Crea un array de números de 100 posiciones, que contendrá los números del 
		//1 al 100. Obtén la suma de todos ellos y la media.

		  int media, suma = 0;
	        int[] array = new int[100];
	        for (int i = 0; i < array.length; i++) {
	            array[i] = i+1;
	            System.out.println(array[i]);
	            suma += i+1;
	        }
	        media = suma / array.length;
	        System.out.println("La suma es: "+suma);
	        System.out.println("La media es: "+media);
	}

}
