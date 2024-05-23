package Test;

public class TestArgumentosVariables{
    public static void main(String[] args) {
        imprimirNumeros(1, 2, 3);
        imprimirNumeros(4, 5);
        variosParametros("María", "Magdalena", 5, 4, 3, 2, 1);
    }

    private static void variosParametros(String nombre, String apellido, int ...numeros){
        System.out.println("Nombre: "+nombre);
        System.out.println("Apellido: "+apellido);
        imprimirNumeros(numeros);
    }

    private static void imprimirNumeros(int ...numeros) {
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Elementos: "+numeros[i]);
            
        }
    }
}
