package estructuraciclos;

public class Ciclos4_DGM {

	public static void main(String[] args) {
		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas

  int Horas;
  int Minutos;
  int Segundos;
	  
	for(Horas = 0; Horas < 24; Horas++) {
	    for(Minutos = 0; Minutos < 60; Minutos++) {
	        for(Segundos = 0; Segundos < 24; Segundos++) {  
	            
	        	System.out.println(Horas+":"+Minutos+":"+Segundos);
	       }
	   }
	}
  } 
}

