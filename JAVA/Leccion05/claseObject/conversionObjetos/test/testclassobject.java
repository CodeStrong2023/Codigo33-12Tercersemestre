package TercerSemestreee.Java.Leccion05.claseObject.conversionObjetos.test;

import TercerSemestreee.Java.Leccion05.claseObject.conversionObjetos.domain.*;
;

public class testclassobject {
    public static void main(String[] args) {
        Empleado1 empleado1 = new Empleado1("Juan", 10000);
        Empleado1 empleado2 = new Empleado1("Juan", 10000);

        if (empleado1 == empleado2) {
            System.out.println("Tienen la misma referencia de memoria");
        }else{
            System.out.println("Tienen difrerente referencia de memoria");
        }

        if (empleado1.equals(empleado2)) {
            System.out.println("Los objetos son iguales en contenido");
        } else {
            System.out.println("Los objetos son distintos en contenido");
        }

        if (empleado1.hashCode() == empleado2.hashCode()) {
            System.out.println("El valor hashCode es igual.");
        } else {
            System.out.println("El valor hashCode es distinto.");
        }
        


    }
}
