package curso;

public class EstructurasCondicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int x = 20;
		/*
		if (x > 10) {
			System.out.println("Si");
		} {
			System.out.println("No");
		} */
	/*
		if (x > 5 && x < 9){
		System.out.println("Si");
	} else {
		System.out.println("No");
	}
	*/
		/*
		if (x > 5 || x < 9) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		*/
		
		/*
		if (x == 20) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		*/
		/*
		if (!(x != 20)) {
			System.out.println("Si");
		} else {
			System.out.println("No");
		}
		*/
		/*
		int dia = 6;
		if (dia == 1) {
			System.out.println("Lunes");
		} else if (dia == 2) {
			System.out.println("Martes");
		} else if (dia == 3) {
			System.out.println("Miercoles");
		} else if (dia == 4) {
			System.out.println("Jueves");
		} else if (dia == 5) {
			System.out.println("Viernes");
		} else {
			System.out.println("Fin de Semana");
		}
		*/
		int dia = 7;
		switch (dia) {
		case 1:
			System.out.println("Lunes");
			break;
		case 2:
			System.out.println("Martes");
			break;
		case 3:
			System.out.println("Miercoles");
			break;
		case 4:
			System.out.println("Jueves");
			break;

		default:
			System.out.println("Error");
			break;
		}
	}
}
