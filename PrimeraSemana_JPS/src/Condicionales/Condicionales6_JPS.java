package Condicionales;

import java.util.Scanner;

public class Condicionales6_JPS {

	public static void main(String[] args) {
		
		
		/*La asociaci�n de vinicultores tiene como pol�tica fijar un precio inicial al kilo
		de uva, la cual se clasifica en tipos (A y B), y adem�s en tama�os (1 y 2).
		Cuando se realiza la venta del producto, �sta es de un s�lo tipo y tama�o, se
		requiere determinar cu�nto recibir� un productor por la uva que entrega en un
		embarque considerando lo siguiente: * Si es de tipo A, se le cargan 20
		c�ntimos al precio inicial cuando es de tama�o 1 y 30 c�ntimos si es de
		tama�o 2. * Si es de tipo B, se rebajan 30 c�ntimos cuando es de tama�o 1, y
		50 c�ntimos cuando es de tama�o 2. Precio inicial se recibe desde teclado
		*/
		
         //Declaramos nuestras variables donde queremos guardar los valores
		
		double kilo;
		String tipo;
		double tama�o;
		double costoxkilo;
		
				
		
		//Declarar una variable de la clase Scanner 
		
		Scanner input = new Scanner(System.in);
		//Lo que escribamos lo pondremos en la variable tipo
		System.out.println("Introduce tu tipo de uva A o B");
		tipo = input.nextLine();
		
		
		//Lo que escribamos a la variable tama�o
		System.out.println("Introduce el tama�o de la uva 1 o 2");
		tama�o = input.nextDouble();
		
		//Escribimos la cantidad en kilos que queremos calcular
		//de las uvas ya para saber el total a pagar con todo y sus impuestos previos 
		//en centavos
		System.out.println("Escribe la cantidad en kilos que desea calcular");
		kilo = input.nextDouble();
		
		//Escribimos desde el teclado el costo fijo inicial por kilo 
		//costo fijo de 15 pesos
		System.out.println("Costo fijo inicial : ");
		costoxkilo = input.nextDouble();
		
		
		//declaramos las dependientes fijas como el precio y los impuesto	
		
		
				//declaramos que depende del precio fijado inicial 
				//por kilo de uva antes de ser
				//caracterizada.
				
				double Acomision1=(0.2);
			    double Acomision2=(0.3);
		     	double Bcomision1=(0.3001);
				double Bcomision2=(0.5);
		
		String x=("A");
		int r=(2);
				
		if((tipo==x)&&(tama�o==r) ) {
			System.out.println("Cantidad total en pesos a pagar :" + (costoxkilo+Acomision2)*kilo);
		}else {
			System.out.println(" ");
		}
		
		String d=("A");
		int q=(1);
				
		if((tipo==d)&&(tama�o==q) ) {
			System.out.println("Cantidad total en pesos a pagar :" + (costoxkilo+Acomision1)*kilo);
		}else {
			System.out.println(" ");
		}
		
		String m=("B");
		int p=(2);
				
		if((tipo==m)&&(tama�o==p) ) {
			System.out.println("Cantidad total en pesos a pagar :" + (costoxkilo-Bcomision2)*kilo);
		}else {
			System.out.println(" ");
		}
		
		String u=("B");
		int n=(1);
				
		if(!(tipo==u)&&!(tama�o==n) ) {
			System.out.println("Cantidad total en pesos a pagar :" + (costoxkilo-Bcomision1)*kilo);
		}else {
			System.out.println(" ");
		}

	
		
		
		
	}//cierre de main

}
