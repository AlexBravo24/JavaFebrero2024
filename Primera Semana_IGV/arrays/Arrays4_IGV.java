package arrays;

public class Arrays4_IGV {

	public static void main(String[] args) {
		/*
		4. Dado un array de n�meros de 5 posiciones con los siguientes valores:
		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
		los valores invertidos, es decir, que el segundo array deber� tener los valores 
		{5,4,3,2,1}.
		*/
		
		int [] array = {1, 2, 3, 4, 5};
		int [] arreglo = new int [5];
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
			
		}
		
		for (int j = 0; j < array.length; j++) {
			arreglo[j] = array[4-j];
			System.out.println(arreglo[j]);
			
		}

	}

}
