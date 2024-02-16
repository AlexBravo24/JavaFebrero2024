package estructuraciclos;

public class Ciclos5_DGM {

	public static void main(String[] args) {
		// 5. Una persona desea invertir $1000.00 en un banco, el cual le otorga un 2% 
		//de interés mensual. ¿Cuál será la cantidad de dinero que esta persona 
		//tendrá al cabo de un año si todo el dinero lo reinvierte
     
		int Mes;
		int Ahorro;
		int Ahorro_Total = 0;
		
	for(Mes = 1 ; Mes <13; Mes++) {
		 Ahorro = Mes * 1020;
		Ahorro_Total = Ahorro_Total + Ahorro;
		System.out.println("Su Ahorro en el mes N°" +Mes+ " es de :$" +Ahorro);
	}
	  System.out.println("Su ahorro Total en un año es de :$" +Ahorro_Total);
	}
}
