package Arrays;

public class Arrays2_JPS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del
		//1 al 100. Obt�n la suma de todos ellos y la media.
		
		// Crear un array de 100 posiciones
        int[] numeros = new int[100];

        // Llenar el array con los n�meros del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Calcular la suma de todos los n�meros
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Mostrar resultados por consola
        System.out.println("La suma de todos los n�meros es: " + suma);
        System.out.println("La media de todos los n�meros es: " + media);
	}

}
