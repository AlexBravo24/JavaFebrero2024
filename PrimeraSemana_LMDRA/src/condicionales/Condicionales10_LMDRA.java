package condicionales;

import java.util.Scanner;

public class Condicionales10_LMDRA {
	//Verificar cuantos dias tiene cada mes del a�o
	public static void main(String[] args) {
		//Establecemos las variables que seran utilizadas
		int nMes,diasEnMes;
		Scanner input = new Scanner(System.in);
		System.out.println("Veamos cu�ntos d�as tiene el mes que ingrasaras");
		System.out.println("Ingresa el mes en n�mero");
		nMes=input.nextInt();
		//Con un switch separamos los 3 casos posibles 
		
		switch(nMes) {
        case 1: case 3: case 5: case 7: case 8: case 10: case 12:
            diasEnMes = 31;
            break;
        case 4: case 6: case 9: case 11:
            diasEnMes = 30;
            break;
        case 2:
            diasEnMes = 28; // consideramos el a�o no bisiesto
            break;
        default:
            System.out.println("N�mero de mes incorrecto.");
           
            return;
		}
		System.out.println("El mes "+nMes+" tiene "+diasEnMes+ " d�as");
	}

}
