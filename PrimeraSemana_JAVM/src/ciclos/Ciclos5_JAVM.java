package ciclos;

public class Ciclos5_JAVM {

	public static void main(String[] args) {
		/*Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		 * de interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá
            al cabo de un año si todo el dinero lo reinvierte?
            
            para(una variable iniciada;condicion;incremento){
		 * ejecuta el codigo
		 */
		double inversionInicial = 1000.00; // Inversión inicial
        double tasaInteresMensual = 0.02; // Tasa de interés mensual (2%)
        int meses = 12; // Número de meses

        double saldo = inversionInicial; // Saldo inicial

        // Calculamos el saldo al final de cada mes y reinvertimos el saldo para el siguiente mes
        for (int i = 0; i < meses; i++) {
            double interes = saldo * tasaInteresMensual; // Calculamos el interés del mes
            saldo = saldo + interes; // Sumamos el interés al saldo
        }

        System.out.println("Después de " + meses + " meses, el saldo será de: $" + saldo);
    }
		
	

}

