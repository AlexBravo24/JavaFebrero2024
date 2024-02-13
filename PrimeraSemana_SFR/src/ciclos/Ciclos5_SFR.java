package ciclos;

public class Ciclos5_SFR {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		//tendrá al cabo de un año si todo el dinero lo reinvierte?
		
		 double inversionInicial = 1000.00;
	        double interesMensual = 0.02; 
	        int mesesEnUnAnio = 12;
	    
	        double cantidadTotal = inversionInicial;
	        for (int i = 0; i < mesesEnUnAnio; i++) {
	            cantidadTotal += cantidadTotal * interesMensual; 
	        }

	       
	        System.out.println("Después de un año, la cantidad de dinero será: $" + cantidadTotal);
		
	}

}
