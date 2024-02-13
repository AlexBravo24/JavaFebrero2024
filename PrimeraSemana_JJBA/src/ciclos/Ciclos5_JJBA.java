package ciclos;

public class Ciclos5_JJBA {

	public static void main(String[] args) {
		
		//Ejercicio5 - . Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte?

		double dinero;
		dinero = 1000;
		
		double tasainteres;
		tasainteres = 0.02;
		
		int meses;
		meses = 12;
		
		double saldo;
		saldo = dinero;
		
		for (int i = 0; i < meses; i++) {
			double interes;
			interes = saldo * tasainteres;
			saldo += interes;
			
		}
		System.out.println("El saldo al final del año es de: $" + saldo);
		
		
	}

}
