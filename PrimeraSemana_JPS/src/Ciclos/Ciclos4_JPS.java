package Ciclos;

public class Ciclos4_JPS {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
        /*
         * . Simular el comportamiento de un reloj digital, imprimiendo la hora,
         * minutos y segundos de un día desde las 00:00:00 horas hasta las 23:59:59
         * horas
         */
		for (int horas = 0; horas < 24; horas++) {
            for (int minutos = 0; minutos < 60; minutos++) {
                for (int segundos = 0; segundos < 60; segundos++) {
                    System.out.printf("%02d:%02d:%02d\n", horas, minutos, segundos);
                    // Pausa de 1 segundo (1000 milisegundos)
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
		}
	}

}
