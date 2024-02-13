package curso;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] numeros = new int [10];
		char [] caracter = new char [5];
		String [] cadena = new String [3];
		
		numeros[0] = 100;
		numeros[1] = 200;
		numeros[2] = 300;
		numeros[3] = 400;
		numeros[4] = 500;
		numeros[5] = 600;
		
		System.out.println(numeros[3]);
		int suma = numeros[1] + numeros[3];
		System.out.println(suma);
		
		cadena[0] = "Arriba";
		cadena[1] = "cream";
		
		caracter[0] = cadena[0].charAt(2);
		System.out.println(caracter[0]);
		
		numeros[3] = 500;
		System.out.println(numeros[3]);
		
		int [] enteros = {100, 200, 300, 400, 500};
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		for (int j = 4; j >= enteros.length; j--) {
			System.out.println(enteros[j]);
			
		}	
		}
	}

}
