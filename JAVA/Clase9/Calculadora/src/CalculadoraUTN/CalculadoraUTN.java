import java.util.Scanner;

public class CalculadoraUTN {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println(">> Aplicación Calculadora <<");
            mostrarMenu(); // Mostrar el menú

            try {
                int operacion = Integer.parseInt(entrada.nextLine());
                if (operacion >= 1 && operacion <= 4) {
                    ejecutarOperacion(operacion, entrada);
                } // Fin if
                else if (operacion == 5) {
                    System.out.println("Hasta pronto...");
                    break; // termina la ejecucion del programa
                } else {
                    System.out.println("Opcion erronea: " + operacion);
                }
                System.out.println();
            } catch (Exception e) {
                System.out.println("Ocurrio un error: " + e.getMessage());
                System.out.println();
            } 
        } 
        entrada.close();
    } // Fin main

    private static void mostrarMenu() { // Mostrar el menú
        System.out.println("           1. Suma\n" + "           2. Resta\n" + "           3. Multiplicacion\n" + "           4. Division\n" + "           5. Salir\n");
        System.out.print("Selecciona la operacion a realizar (1-5): ");
    } // Fin de mostrarMenú

    private static void ejecutarOperacion(int operacion, Scanner entrada) {
        System.out.print("Ingrese un valor para el operando1: ");
        var operando1 = Double.parseDouble(entrada.nextLine());
        System.out.print("Ingrese un valor para el operando2: ");
        var operando2 = Double.parseDouble(entrada.nextLine());

        Double resultado;

        switch (operacion) {
            case 1 -> {
                resultado = operando1 + operando2;
                System.out.println("Resultado de la suma: " + resultado);
            }
            case 2 -> {
                resultado = operando1 - operando2;
                System.out.println("Resultado de la resta: " + resultado);
            }
            case 3 -> {
                resultado = operando1 * operando2;
                System.out.println("Resultado de la multiplicacion: " + resultado);
            }
            case 4 -> {
                if (operando2 == 0) {
                    System.out.println("La division por cero no es una operacion permitida");
                } else {
                    resultado = operando1 / operando2;
                    System.out.println("Resultado de la division: " + resultado);
                }
            }
            default -> System.out.println("Opcion Erronea: operacion");

        }
    } 
}