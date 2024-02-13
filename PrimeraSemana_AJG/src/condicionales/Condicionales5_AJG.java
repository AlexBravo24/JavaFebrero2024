package condicionales;

import java.util.Scanner;

public class Condicionales5_AJG {

    public static void main(String[] args) {
        // 5. Realiza un programa que calcule la aceptaci�n de una solicitud en base a 
        // los siguientes par�metros: edad, nota y sexo. 
        // M�nimo: Nota (5), edad (18), sexo M -> POSIBLE 
        // M�nimo: Nota (5), edad (18), sexo F -> ACEPTADA 
        // Otros casos -> NO ACEPTADA
        
        int edad;
        int nota;
        String sexo;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduce la Edad: ");
        edad = input.nextInt();
        
        System.out.println("Introduce la nota: ");
        nota = input.nextInt();
        
        System.out.println("Introduce el sexo (M o F): ");
        sexo = input.next();
        
        if (nota >= 5 && edad >= 18) {
            if (sexo.equalsIgnoreCase("M")) {
                System.out.println("La solicitud es POSIBLE.");
            } else if (sexo.equalsIgnoreCase("F")) {
                System.out.println("La solicitud es ACEPTADA.");
            } else {
                System.out.println("El sexo ingresado no es v�lido.");
            }
        } else {
            System.out.println("La solicitud NO ES ACEPTADA.");
        }
    }
}