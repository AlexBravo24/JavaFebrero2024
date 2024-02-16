package condicionales;

import java.util.Scanner;

public class Condicionales3_SFR {

	public static void main(String[] args) {
		
		//3.Crea un programa que pida al usuario dos números y muestre el resultado
		//de su división. Si el segundo número es 0, debe mostrar un mensaje de error.
		float numero1 = 0;
		float numero2 = 0;
		float resultado;
	Scanner input = new Scanner(System.in);
	System.out.println("Introduce el Primer numero");
	 numero1=input.nextFloat();
	System.out.println("Introduce el segundo numero");
     numero2=input.nextFloat();
     resultado =numero1/numero2;
     if (numero2==0) {
			System.out.println("error");
		}else { 
			System.out.println("resultado " + (numero1/numero2));
		}
		
	
	}

}
