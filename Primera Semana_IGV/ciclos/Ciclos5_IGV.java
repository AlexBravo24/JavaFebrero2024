package ciclos;

public class Ciclos5_IGV {

	public static void main(String[] args) {
		/*
		5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		de inter�s mensual. �Cu�l ser� la cantidad de dinero que esta persona 
		tendr� al cabo de un a�o si todo el dinero lo reinvierte?
		*/
		
		double inicial = 1000;
		int i = 1;
		
		while (i <= 12) {
			inicial = inicial + inicial*0.02;
			System.out.println("Mes: " + i + " cantidad total a la fecha:  " + inicial);
			i++;
			
		}

	}

}
