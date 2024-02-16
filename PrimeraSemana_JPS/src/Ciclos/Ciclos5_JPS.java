package Ciclos;

public class Ciclos5_JPS {

	public static void main(String[] args) {
		
		// 

		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de interés mensual. ¿Cuál será la cantidad de dinero que esta persona
		 * tendrá al cabo de un año si todo el dinero lo reinvierte?
		 */
		double inversionInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int meses = 12;

        double inversionFinal = inversionInicial;

        for (int i = 0; i < meses; i++) {
            // Calcula el interés para el mes actual
            double interes = inversionFinal * tasaInteresMensual;
            // Añade el interés a la inversión final
            inversionFinal += interes;
        }

        System.out.printf("Después de %d meses, la cantidad de dinero será: $%.2f\n", meses, inversionFinal);
	}

}
