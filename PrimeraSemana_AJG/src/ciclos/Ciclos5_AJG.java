package ciclos;

public class Ciclos5_AJG {

	public static void main(String[] args) {
//		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
//		de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
//		tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		 double capitalInicial = 1000.00; // Capital inicial de $1000.00
	        double interesMensual = 0.02; // Interés mensual del 2%

	        // Calcular el capital al cabo de un año
	        for (int mes = 1; mes <= 12; mes++) {
	            capitalInicial *= (1 + interesMensual); // Aplicar el interés mensual
	        }

	        // Mostrar el capital al cabo de un año
	        System.out.printf("El capital al cabo de un año es: $" + capitalInicial);
	}
}
