package ciclos;

import java.util.Scanner;

public class Ciclos3_AJG {
  
	public static void main(String[] args) {
//		3. Realiza un programa para determinar si un String es pal�ndromo
		
		 // Solicitar al usuario un string
        Scanner input = new Scanner(System.in);
        System.out.print("Ingresa una palabra o frase: ");
        String texto = input.nextLine();

        // Eliminar los espacios en blanco y convertir a min�sculas
        texto = texto.replaceAll("\\s+", "").toLowerCase();

        // Verificar si el texto es un pal�ndromo
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
            System.out.println("El texto ingresado es un pal�ndromo.");
        } else {
            System.out.println("El texto ingresado no es un pal�ndromo.");
        }
	}
}
