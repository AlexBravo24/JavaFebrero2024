package ciclos;

public class Ciclos5_SFR {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		
		 double inversionInicial = 1000.00;
	        double interesMensual = 0.02; 
	        int mesesEnUnAnio = 12;
	    
	        double cantidadTotal = inversionInicial;
	        for (int i = 0; i < mesesEnUnAnio; i++) {
	            cantidadTotal += cantidadTotal * interesMensual; 
	        }

	       
	        System.out.println("Despu�s de un a�o, la cantidad de dinero ser�: $" + cantidadTotal);
		
	}

}
