package ciclos;

import java.util.Scanner;

public class Ciclos3_AJG {
  
	public static void main(String[] args) {
//		3. Realiza un programa para determinar si un String es palíndromo
		
		 // Solicitar al usuario un string
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = input.nextLine();

        // Eliminar los espacios en blanco y convertir a minúsculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Verificar si el texto es un palíndromo
        boolean esPalindromo = true;
        int longitud = texto.length();
        for (int i = 0; i < longitud / 2; i++) {
            if (texto.charAt(i) != texto.charAt(longitud - 1 - i)) {
                esPalindromo = false;
                break;
            }
        }

        // Mostrar el resultado
        if (esPalindromo) {
            System.out.println("El texto ingresado es un palíndromo.");
        } else {
            System.out.println("El texto ingresado no es un palíndromo.");
        }
	}
}
