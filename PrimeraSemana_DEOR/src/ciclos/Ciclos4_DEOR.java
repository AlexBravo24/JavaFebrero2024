package ciclos;

public class Ciclos4_DEOR {

	public static void main(String[] args) {
		
		//4. Simular el comportamiento de un reloj digital, imprimiendo la hora, minutos y 
		//segundos de un día desde las 00:00:00 horas hasta las 23:59:59 horas
		
		
		
		int s, m=0, h=0;
		
		for (s=0; s < 61; s++) {
			if (s==60) {
				s=0;
				m++;
				if (m==60) {
					m=0;
					h++;
					System.out.println(h + ":" + m + ":" + s);
					if (h==24) {
					break;	
					}
				}
				else {
					System.out.println(h + ":" + m + ":" + s);
			}
			}
			else {
				System.out.println(h + ":" +  m + ":" + s);
			}
		}
		
		
		
		
		
	}
}
