package ciclos;

public class Ciclos4_DEOR_Correccion {

	public static void main(String[] args) {
		
		int horas,minutos,segundos;
		
		for (horas=0;horas<24;horas++) {
			for (minutos=0;minutos<60;minutos++) {
				for (segundos=0;segundos<60;segundos++) {
					System.out.printf("%02d:%02d:%02d%n",horas,minutos,segundos);
				}
			}
		}
	}
}
