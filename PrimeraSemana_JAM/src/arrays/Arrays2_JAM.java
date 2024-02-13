package arrays;

public class Arrays2_JAM {

	public static void main(String[] args) {
		
		/*
		 * Crea un array de números de 100 posiciones, que contendrá los números del
		 * 1 al 100. Obtén la suma de todos ellos y la media
		 */
		int[] numeros = new int[100];//Arreglo de 100 posiciones (o sea del 0 - 9)
		int suma = 0;
		float media;
		for (int i = 0; i <100; i++) {//Comienza a contar en la posición 0, HASTA que la posicion sea menor a 10 (o sea posc 9 (que incluye el tamaño del arreglo de 10 pos))
			numeros[i] = i+1;         //Comienza a almacenar los valores desde la posicion 0,Comenzando a contar en 0 +1 =1. Pos[0] = 1.
			System.out.println(numeros[i]);
			suma = suma + (i+1); //Haceos la suma a partir de la posicion 0+1, o sea 0+1 = 1 (posicion 0) + (1+1=2)<- posicion = 2 <- valor de la posicion
			//System.out.println("Suma"+suma);
		}
		System.out.println("Suma"+suma);
		System.out.println("Media"+(suma/numeros.length));
//		System.out.println();
//		System.out.println(numeros[]);
	}
	

}
