package ciclos;

public class Ciclos4_IGV {

	public static void main(String[] args) {
		/*
		4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		horas
		*/
		
		int hora;
		int minuto;
		int segundo;
		
		for (hora = 0; hora <24; hora++) {
			
			for (minuto = 0; minuto < 60; minuto++) {
			
				for (segundo = 1; segundo < 60; segundo++) {
					System.out.println(hora+":"+minuto+":"+segundo );
				}
			}
		}
	}

}
