package arrays;

public class Arrays4_DEOR {

	public static void main(String[] args) {
		
		//4. Dado un array de números de 5 posiciones con los siguientes 
		//valores: {1,2,3,4,5}. Guardar los valores de este array en otro 
		//array distinto pero con los valores invertidos, es decir, que el 
		//array deberá tener los valores {5,4,3,2,1}.
		
		int [] arreglo1 = {1, 2, 3, 4, 5};
		int [] arreglo2 = new int [5];
		for (int i = 4; -1 < i && i < arreglo1.length; i--) {//coloque el -1 para eliminar el error
			arreglo2 [i] = arreglo1 [i];
			System.out.println(arreglo2[i]); //sigue buscando despues de llegar al 0
		}
		
	}
}
