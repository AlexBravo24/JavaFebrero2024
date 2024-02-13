package ciclos;

public class Ciclos5_DEOR {

	public static void main(String[] args) {
		
		//5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona tendrá 
		//al cabo de un año si todo el dinero lo reinvierte?
		
		double interes = 0.02, inv = 1000, reinv, total, meses = 12;
		
		for (int i = 0; i < meses + 1; i++) {
			total = inv * interes;
			inv = total + inv;
			System.out.println("Tu total del " + i + " es " + inv);
		}
		
		
		
	}
}
