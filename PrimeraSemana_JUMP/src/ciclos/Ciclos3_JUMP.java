package ciclos;

public class Ciclos3_JUMP {

	public static void main(String[] args) {
		
		// 3. Realiza un programa para determinar si un String es palíndromo
		
		String Palabra = "ojo rojo";
		
		int inc = 0;
		int des = Palabra.length()-1;
		boolean Error = false;
		
		while ((inc<des) && (!Error)) {
					
			if (Palabra.charAt(inc)==Palabra.charAt(des)){				
				inc++;
				des--;
			} else {
				Error = true;
			}
		}
		
		if (!Error)
			System.out.println(Palabra + " es un PALINDROMO");
		else
			System.out.println(Palabra + " NO es un palindromo");
		
		
		
	}

}
