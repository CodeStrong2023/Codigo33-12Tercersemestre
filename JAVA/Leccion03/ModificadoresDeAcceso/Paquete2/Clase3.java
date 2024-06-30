package TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete2;

import TercerSemestreee.Java.Leccion03.ModificadoresDeAcceso.Paquete1.Clase1;

public class Clase3 extends Clase1 {
    public  Clase3 (){
        super("Protected");
        this.atributoProtected = "Accedemos desde la clase hija";
        System.out.println("Atributo protected = " + this.atributoProtected);
        this.atributoPublico = "Este es totalmente publico";
    }
}
