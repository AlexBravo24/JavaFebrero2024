package ciclos;

public class Ciclos5_JAM {
	public static void main(String[] args) {
		
		/*
		 * . Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de inter�s mensual. 
		 * 
		 * �Cu�l ser� la cantidad de dinero que esta persona
		 * tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		 */
		
		int mes = 0;
		double interes = 0;
		double ingreso = 1000.00;
		double iinicial;
		
		iinicial = ingreso;
		
		while (mes<=12) {
			interes = ingreso * 0.02;
			ingreso = ingreso + interes;
			mes++;
		}
		System.out.println("La inversion de todo el a�o es: "+(ingreso-iinicial));
		System.out.println("La ganancia es: "+ingreso);
	}
}
