package arrays;

public class arrays2_JAVM {

	public static void main(String[] args) {
		/*2. Crea un array de números de 100 posiciones, 
		 * que contendrá los números del 1 al 100. Obtén la suma de todos ellos y la media.
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
