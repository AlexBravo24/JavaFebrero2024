package arrays;

public class Arrays4_LMDRA {
	//Dado un array de números de 5 posiciones
	//Guardar los valores de este array en otro array distinto pero con 
	//los valores invertidos
	public static void main(String[] args) {
		//Se crean las variabels que seran utilizadas
		int [] numerosP= {1,2,3,4,5};
		int [] numerosS=new int[numerosP.length];
		for (int i=(numerosP.length-1);i>=0;i--) {
			numerosS[i]=numerosP[numerosP.length-i-1];
			//System.out.println(numerosP[i]);
		}
		System.out.println("Los arreglos quedarían de la siguiente manera");
		//Impresion arreglo P
		for (int i:numerosP) {
			System.out.print(i+", ");
		}
		System.out.println();
		for (int i:numerosS) {
			System.out.print(i+", ");
		}
	}

}
