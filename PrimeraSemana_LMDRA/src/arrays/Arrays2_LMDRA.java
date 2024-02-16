package arrays;

public class Arrays2_LMDRA {
	/*Crea un array de números de 100 posiciones, que contendrá los números del 
1 al 100. Obtén la suma de todos ellos y la media.*/
	public static void main(String[] args) {
		//Creamos las variables que seran utilizadas
		double [] sumatoria=new double[100];
		double suma,media;
		suma=0;
				
		//se llena el arreglo con un ciclo for
		for (int i=0;i <sumatoria.length;i++) {
			sumatoria[i]=i+1;
		}
		//se hace la suma de los valores dentro del arreglo
		for(double x:sumatoria) {
			suma=suma+x;
		}
		//se realiza la operacion para calcular la media
		media=(suma/sumatoria.length);
		System.out.println("La suma de todos los valores del arreglo es: "+suma);
		System.out.println("La media de los valores del arreglo es: "+media);
		
	}

}
