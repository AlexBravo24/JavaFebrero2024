package arrays;

public class Arrays2_DEOR {

	public static void main(String[] args) {
		
		//2. Crea un array de n�meros de 100 posiciones, que contendr� los 
		//n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
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
