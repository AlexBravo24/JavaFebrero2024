package Ciclos;

public class Ciclos5_JPS {

	public static void main(String[] args) {
		
		// 

		/*
		 * 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2%
		 * de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona
		 * tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		 */
		double inversionInicial = 1000.00;
        double tasaInteresMensual = 0.02;
        int meses = 12;

        double inversionFinal = inversionInicial;

        for (int i = 0; i < meses; i++) {
            // Calcula el inter�s para el mes actual
            double interes = inversionFinal * tasaInteresMensual;
            // A�ade el inter�s a la inversi�n final
            inversionFinal += interes;
        }

        System.out.printf("Despu�s de %d meses, la cantidad de dinero ser�: $%.2f\n", meses, inversionFinal);
	}

}
