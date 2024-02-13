package ciclos;

public class Ciclos1_AJG {
    public static void main(String[] args) {
        // Realizar la tabla de multiplicar del 12
        int multiplicador = 12;
        System.out.println("Tabla de multiplicar del 12:");
        for (int i = 1; i <= 10; i++) {
            int resultado = multiplicador * i;
            System.out.println(multiplicador + " x " + i + " = " + resultado);
        }
    }
}
