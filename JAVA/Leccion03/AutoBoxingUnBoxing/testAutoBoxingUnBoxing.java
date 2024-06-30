package TercerSemestreee.Java.Leccion03.AutoBoxingUnBoxing;

public class testAutoBoxingUnBoxing {

    public static void main(String[] args) {
        //Clases envolventes o wrapper

        /*Tipos de clase envolvente: 
         *
         * int = La clase envolvente es interger
         * long = La clase envolvente es long
         * float = La clase envolvente es Float
         * double = La clase envolvente es Double
         * boolean = La clase envolvente es Boolean
         * byte = La clase envolvente es Byte
         * char = La clase envolvente es Character
         * short = La clase envolvente es Short
         * 
         */

        int enteroPrim = 10;//Tipo primitivo
        Integer entero = 10;//Tipo object
        System.out.println("Numero entero primitivo = " + enteroPrim);
        System.out.println("Numero object = " +entero.doubleValue());

        //Unboxing
        int entero2 = entero;
        System.out.println("Numero 2 = " + entero2);

    }
}
