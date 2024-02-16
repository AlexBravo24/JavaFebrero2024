package ciclos;

public class Ciclos5_JAVM {

	public static void main(String[] args) {
		/*Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		 * de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona tendr�
            al cabo de un a�o si todo el dinero lo reinvierte?
            
            para(una variable iniciada;condicion;incremento){
		 * ejecuta el codigo
		 */
		double inversionInicial = 1000.00; // Inversi�n inicial
        double tasaInteresMensual = 0.02; // Tasa de inter�s mensual (2%)
        int meses = 12; // N�mero de meses

        double saldo = inversionInicial; // Saldo inicial

        // Calculamos el saldo al final de cada mes y reinvertimos el saldo para el siguiente mes
        for (int i = 0; i < meses; i++) {
            double interes = saldo * tasaInteresMensual; // Calculamos el inter�s del mes
            saldo = saldo + interes; // Sumamos el inter�s al saldo
        }

        System.out.println("Despu�s de " + meses + " meses, el saldo ser� de: $" + saldo);
    }
		
	

}

