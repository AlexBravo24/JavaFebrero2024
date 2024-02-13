package condicionales;

import java.util.Scanner;

public class Condicionales4_DGM {

	public static void main(String[] args) {
		// 4. Realiza un programa que lea una cadena por teclado y compruebe si 
		//contiene letras mayúsculas.

String Palabra;
String Palabra1;
boolean Palabra2;

Scanner Entrada = new Scanner (System.in);

 System.out.print("Digite la palabra :");
 Palabra = Entrada.next();
 //hola 
 
 Palabra1 = Palabra.toUpperCase();
 //HOLA
  
 if (Palabra == Palabra1) {
 System.out.println("La frase es en Mayuscula");
 }
 else {
	 System.out.println("La Frase no es en Mayuscula");
 }
 }
 }
 
	
	
	

