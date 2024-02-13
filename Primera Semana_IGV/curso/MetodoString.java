package curso;

public class MetodoString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
		String fecha = "Hoy 7 de febrero";
		System.out.println(fecha.length());
		System.out.println(fecha.charAt(1));
		System.out.println(fecha.substring(5));
		System.out.println(fecha.substring(5, 15));
		
		System.out.println(fecha.toUpperCase());
		System.out.println(fecha.toLowerCase());
		
		System.out.println(fecha.equals("hoy 7 de febrero"));
		System.out.println(fecha.equalsIgnoreCase("hoy 7 de febrero"));
		
		System.out.println(fecha.replace("2024" , "2025"));
		System.out.println(fecha.replace("o", "$"));
		
*/
		String msj = "Valor devuelto = ";
		String cdn = "Las cadenas son inmutables";

		System.out.println(msj + cdn.endsWith("inmutables!!"));
		System.out.println(msj + cdn.endsWith("inmutables"));
		System.out.println(cdn.charAt(cdn.length()-1));
		

	}

}
