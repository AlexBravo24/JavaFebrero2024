package ciclos;

public class Ciclos5_JUMP {

	public static void main(String[] args) {
		
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		//tendr� al cabo de un a�o si todo el dinero lo reinvierte
		
        int dinero = 1000;
        double porcentaje = 0.02;
		
        System.out.println("INVERSION $ 1000 DE 2% POR MES DURANTE 12 MESES");
		
		for (int mes = 1 ; mes <= 12; mes++) {
			System.out.println( "Mes " + mes + " $ " + (mes*dinero*porcentaje+dinero) );
			
		}
		System.out.println("En 12 meses se obtiene $ " + (12*dinero*porcentaje+dinero) );
		
		
		
		

	}}

