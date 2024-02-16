package Arrays;

public class Arrays4_JPS {

	public static void main(String[] args) {
		// 
//		Dado un array de números de 5 posiciones con los siguientes valores:
//		{1,2,3,4,5}. Guardar los valores de este array en otro array distinto pero con
//		los valores invertidos, es decir, que el segundo array deberá tener los valores
//		{5,4,3,2,1}.
		
		// Array original
        int[] arrayOriginal = {1, 2, 3, 4, 5};

        // Array invertido
        int[] arrayInvertido = new int[arrayOriginal.length];

        // Invertir los valores del array
        for (int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        // Mostrar el array invertido por consola
        System.out.println("El array original es:");
        mostrarArray(arrayOriginal);
        System.out.println("El array invertido es:");
        mostrarArray(arrayInvertido);
    }

    // Método para mostrar un array por consola
    public static void mostrarArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

	}

}
