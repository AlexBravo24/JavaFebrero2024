package ciclos;

public class Ciclos1_DEOR {
 
	public static void main(String[] args) {
	
		//1.- Programa un algoritmo que realice la tabla de multiplicar del 12
		
		int x = 12, t;
		for (int i = 1; i < 11; i++) {
			t = x*i;
			System.out.println("12 x " + i + " = " + t);
		}		
	}
}
