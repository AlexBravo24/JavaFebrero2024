package arrays;

public class arrays2_JAVM {

	public static void main(String[] args) {
		/*2. Crea un array de n�meros de 100 posiciones, 
		 * que contendr� los n�meros del 1 al 100. Obt�n la suma de todos ellos y la media.
		 */
			int[] numeros = new int[100];
			for (int i = 0; i < 100; i++) {
				numeros[i] = i +1;
				
				}
			double suma = 0;
			for (int i = 0; i < 100; i++) {
				suma = suma+numeros [i];
			//System.out.println(suma);
			
	}
			double promedio = suma/100;
			System.out.println("el promedio es "+promedio);
			System.out.println("la suma de todos los numeros es "+suma);
			
	}
}
