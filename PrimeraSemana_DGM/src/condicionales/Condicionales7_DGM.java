package condicionales;

import java.util.Scanner;

public class Condicionales7_DGM {

	public static void main(String[] args) {
		// 7
 
	int Cantidad_Alumnos;
	int CostoX_Alumno;
	int Total_Compa�ia;
	
	Scanner Entrada = new Scanner(System.in);
	
    System.out.print("Digite la Cantidad de Alumnos: ");
	Cantidad_Alumnos = Entrada.nextInt();
	
	if (Cantidad_Alumnos >= 100) {
		Total_Compa�ia = Cantidad_Alumnos * 65;
		CostoX_Alumno = Total_Compa�ia / Cantidad_Alumnos;
		System.out.println("EL Precio Total del Viaje es: $"+Total_Compa�ia);
		System.out.println("El Precio por Alumno es de: $"+CostoX_Alumno);
	}
	else if(Cantidad_Alumnos >= 50 && Cantidad_Alumnos <= 99) {
	Total_Compa�ia = Cantidad_Alumnos * 70;
	CostoX_Alumno = Total_Compa�ia / Cantidad_Alumnos;
	System.out.println("EL Precio Total del Viaje es: $"+Total_Compa�ia);
	System.out.println("El Precio por Alumno es de: $"+CostoX_Alumno);
	}
	else if(Cantidad_Alumnos >= 30 && Cantidad_Alumnos <= 49) {
		Total_Compa�ia = Cantidad_Alumnos * 95;
		CostoX_Alumno = Total_Compa�ia / Cantidad_Alumnos;
		System.out.println("EL Precio Total del Viaje es: $"+Total_Compa�ia);
		System.out.println("El Precio por Alumno es de:  $"+CostoX_Alumno);
	}
	else  {
		Total_Compa�ia = Cantidad_Alumnos * 4000;
		CostoX_Alumno = Total_Compa�ia / Cantidad_Alumnos;
		System.out.println("EL Precio Total del Viaje es: $"+Total_Compa�ia);
		System.out.println("El Precio por Alumno es de:  $"+CostoX_Alumno);
	}
	}
}
