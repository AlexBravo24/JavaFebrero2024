package arrays;

public class Arrays2_DEOR {

	public static void main(String[] args) {
		
		//2. Crea un array de números de 100 posiciones, que contendrá los 
		//números del 1 al 100. Obtén la suma de todos ellos y la media.
		int [] arreglo = new int [100];
		for (int t = 0, i = 0; i < arreglo.length; i++) {
			arreglo [i] = i;
			t += arreglo[i];
			System.out.println(t);
//			System.out.println(media);
			}  
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
