package ciclos;

public class Ciclos4_SFR {

	public static void main(String[] args) {
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora,
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		//horas
		
		int horas,minutos,segundos;
		for(horas=0;horas<24;horas++) {
			for(minutos=0;minutos<60;minutos++) {
				for(segundos=0;segundos<60;segundos++) {
					System.out.printf("%02d:%02d:%02d%n",horas,minutos,segundos);
				}
			}
		}
		

	}

}
