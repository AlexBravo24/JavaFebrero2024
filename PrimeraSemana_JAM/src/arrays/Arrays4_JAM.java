package arrays;

public class Arrays4_JAM {

	public static void main(String[] args) {
		
		/*
		 * Dado un array de números de 5 posiciones con los siguientes valores:
		 * {1,2,3,4,5}.
		 *  Guardar los valores de este array en otro array distinto pero con
		 * los valores invertidos, es decir, que el segundo array deberá tener los valores
		 * {5,4,3,2,1}.
		 */
		
		int arreglo[] = {1,2,3,4,5};
		int inverso[] = new int [arreglo.length];
		
		for (int i = arreglo.length-1; i >= 0; i--) {
			inverso[i] = arreglo[i];
			System.out.println(inverso[i]);
		}
		
		
	}

}
