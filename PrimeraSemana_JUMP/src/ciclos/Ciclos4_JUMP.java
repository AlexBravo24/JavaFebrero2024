package ciclos;

public class Ciclos4_JUMP {

	public static void main(String[] args) {

		// 4. Simular el comportamiento de un reloj digital, imprimiendo la hora, 
		//minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59 
		//horas
		
		
System.out.println("SIMULADOR DE RELOJ");
		

for(int h = 0; h < 24; h++) {
    for(int m = 0; m < 60; m++) {
        for(int s = 0; s < 60; s++) {
            System.out.println(h + ":" + m + ":" + s); // Imprime la hora
            try {
                Thread.sleep(0); // Descansa un segundo
            } catch(InterruptedException e) {
		e.printStackTrace();
            }
	}
    }
}}}
	

		
