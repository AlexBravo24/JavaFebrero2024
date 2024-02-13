package condicionales;

import java.util.Scanner;

public class Condicionales9_AJG {

    public static void main(String[] args) {
    	
//    	9.Realiza un programa que pida el día de la semana (del 1 al 7) y escriba el día 
//    	correspondiente. Si introducimos otro número nos da un error
//        
        int diaSemana;
        Scanner input = new Scanner(System.in);
        System.out.println("Introduce Un dia de la Semana en Numero");
        diaSemana = input.nextInt();
        
        if (diaSemana < 1 || diaSemana > 7) {
            System.out.println("ERROR: El día " + diaSemana + " no existe en la semana");
        } else if (diaSemana == 1) {
            System.out.println("Lunes");
        } else if (diaSemana == 2) {
            System.out.println("Martes");
        } else if (diaSemana == 3) {
            System.out.println("Miércoles");
        } else if (diaSemana == 4) {
            System.out.println("Jueves");
        } else if (diaSemana == 5) {
            System.out.println("Viernes");
        } else if (diaSemana == 6) {
            System.out.println("Sábado");
        } else if (diaSemana == 7) {
            System.out.println("Domingo");
        }
    }
}
