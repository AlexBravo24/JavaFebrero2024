package ciclos;

public class Ciclos5_LMDRA {

	public static void main(String[] args) {
		double monto;
		monto=1000;
		for(int i=1;i<=12;i++) {
			monto=monto+(monto*0.02);
			System.out.println("El dinero al final del mes "+i+" es: $"+monto);
		}
	}

}
