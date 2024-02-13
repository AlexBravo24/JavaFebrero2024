package array;

public class Arrays4_AJG {

	public static void main(String[] args) {
//		4. Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con 
//		los valores invertidos, es decir, que el segundo array deberá tener los valores 
//		{5,4,3,2,1}
		
		 // Dado un array de números de 5 posiciones con los siguientes valores: {1,2,3,4,5}
        int[] arrayOriginal = {1, 2, 3, 4, 5};

        // Crear un segundo array para guardar los valores invertidos
        int[] arrayInvertido = new int[arrayOriginal.length];

        // Invertir los valores y guardarlos en el segundo array
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Mostrar el segundo array con los valores invertidos
        System.out.println("El segundo array con los valores invertidos es:");
        for (int num : arrayInvertido) {
            System.out.print(num + " ");
        }

	}

}
