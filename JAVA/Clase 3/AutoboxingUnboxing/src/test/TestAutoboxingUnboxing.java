
package test;

public class TestAutoboxingUnboxing {
    public static void main(String[] args) {
        //CLASES ENVOLVENTES O WRAPPER
        /*
        CLASES ENVOLVENTES DE TIPOS PRIMITIVOS
        INT = LA CLASE ENVOLVENTE INTEGER
        
        LONG = LA CLASE ENVOLVENTE ES LONG
        FLOAT = LA CLASE ENVOLVENTE ES FLOAT
        DOUBLE = LA CLASE ENVOLVENTE ES DOUBLE
        BOOLEAN = LA CALSE ENVOLVENTE ES BOOLEAN
        BYTE = LA CLASE ENVOLVENTE ES BYTE
        CHAR = LA CLASE ENVOLVENTE ES CHAR 
        SHORT = LA CLASE ENVOLVENTE ES SHORT
        */
        int enteroPrim = 10; //tipo primitivo
        System.out.println("ENTERO PRIMITIVO = " + enteroPrim);
        Integer entero = 10; //tipo object con clase integer
        System.out.println("ENTERO CLASE INTERGER = " + entero.doubleValue()); //Autoboxing
        
        int entero2 = entero; //Unboxing
        System.out.println("ENTERO 2 = " + entero2);
    }
}
