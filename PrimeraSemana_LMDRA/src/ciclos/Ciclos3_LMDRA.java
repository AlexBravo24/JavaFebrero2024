package ciclos;

import java.util.Scanner;

public class Ciclos3_LMDRA {
	//verificar si una pa;abra es palindrome
	public static void main(String[] args) {
		//se declaran las variables que seran utilizadas
		Scanner input = new Scanner(System.in);
		String texto;
		int largoTexto;
		boolean palindrome=false;
		//se solicita al usuario el texto a evaluar
		System.out.println("Introduce el texto que desees conocer si es palindrome");
		texto=input.nextLine().toLowerCase();
		//para realizar la evaluacion se deben remover los espacios
		texto=texto.replace(" ", "");
		
		//System.out.println(texto);
		
		//extraemos el largo del texto
		largoTexto=texto.length();
		
		//en un ciclo for comenzamos la evaluacion
		for (int i=0;i<largoTexto;i++) {
			//a trave de un if comparamos las letras
			if(texto.charAt(i)!=texto.charAt(largoTexto-i-1/*aqui se indica la posicion con la que sera
			evaluado*/)) {
				palindrome=false;//
				
			}else {
				palindrome=true;
			}
						
		}
			if(palindrome) {
			System.out.println("La palabra es palindrome");
		}else {
			System.out.println("La palabra no es palindrome");
		}
		
	}

}
