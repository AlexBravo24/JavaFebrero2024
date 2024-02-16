package Arrays;

public class Arrays2_JPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un array de números de 100 posiciones, que contendrá los números del
		//1 al 100. Obtén la suma de todos ellos y la media.
		
		// Crear un array de 100 posiciones
        int[] numeros = new int[100];

        // Llenar el array con los números del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de todos los números
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Mostrar resultados por consola
        System.out.println("La suma de todos los números es: " + suma);
        System.out.println("La media de todos los números es: " + media);
	}

}
