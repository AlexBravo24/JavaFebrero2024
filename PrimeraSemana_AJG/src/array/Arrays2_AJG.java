package array;

public class Arrays2_AJG {
    public static void main(String[] args) {
//    	2. Crea un array de n�meros de 100 posiciones, que contendr� los n�meros del 
//    	1 al 100. Obt�n la suma de todos ellos y la media.

    	
    	
        // Crear un array de n�meros de 100 posiciones
        int[] numeros = new int[100];

        // Llenar el array con los n�meros del 1 al 100
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = i + 1;
        }

        // Obtener la suma de todos los n�meros
        int suma = 0;
        for (int num : numeros) {
            suma += num;
        }

        // Calcular la media
        double media = (double) suma / numeros.length;

        // Mostrar resultados
        System.out.println("La suma de los n�meros del 1 al 100 es: " + suma);
        System.out.println("La media de los n�meros del 1 al 100 es: " + media);
    }
}
