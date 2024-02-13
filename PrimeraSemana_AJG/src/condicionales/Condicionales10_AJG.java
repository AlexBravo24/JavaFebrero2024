package condicionales;

import java.util.Scanner;

public class Condicionales10_AJG {

    public static void main(String[] args) {
//    	10.Realiza un programa que pida un número entero entre uno y doce e imprima 
//    	el número de días que tiene el mes correspondiente.
    	int numero;
    	
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 12:");
        numero = input.nextInt();

   
        int dias;
        switch (numero) {
            case 1: // Enero
            case 3: // Marzo
            case 5: // Mayo
            case 7: // Julio
            case 8: // Agosto
            case 10: // Octubre
            case 12: // Diciembre
                dias = 31;
                break;
            case 4: // Abril
            case 6: // Junio
            case 9: // Septiembre
            case 11: // Noviembre
                dias = 30;
                break;
            case 2: // Febrero
                dias = 28; // Ignorando años bisiestos
                break;
            default:
                dias = -1; // Si el número no está en el rango válido
                break;
        }

        if (dias != -1) {
            System.out.println("El mes correspondiente tiene " + dias + " días.");
        } else {
            System.out.println("Número fuera del rango válido.");
        }
    }
}
