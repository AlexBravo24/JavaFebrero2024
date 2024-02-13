package ciclos;

public class Ciclos4_JAM {

	public static void main(String[] args) {
		
		/*
		 * Simular el comportamiento de un reloj digital, imprimiendo la hora,
		 * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
		 * horas
		 */

		//int h = 00,m = 00,s =00;
		
		for (int i = 0; i <=23; i++) {
			for (int j = 0; j <=59; j++) {
				for (int k = 0; k <=59; k++) {
					System.out.println("h:"+i+" m:"+j+" s:"+k);
				}
			}
		}
	}

}
