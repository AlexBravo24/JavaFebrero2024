package ciclos;

public class Ciclos5_AJG {

	public static void main(String[] args) {
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
//		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		 double capitalInicial = 1000.00; // Capital inicial de $1000.00
	        double interesMensual = 0.02; // Inter�s mensual del 2%

	        // Calcular el capital al cabo de un a�o
	        for (int mes = 1; mes <= 12; mes++) {
	            capitalInicial *= (1 + interesMensual); // Aplicar el inter�s mensual
	        }

	        // Mostrar el capital al cabo de un a�o
	        System.out.printf("El capital al cabo de un a�o es: $" + capitalInicial);
	}
}
