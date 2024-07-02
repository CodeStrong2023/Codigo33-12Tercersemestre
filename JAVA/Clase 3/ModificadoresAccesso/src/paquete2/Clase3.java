
package paquete2;

import paquete1.Clase1;

public class Clase3 extends Clase1 {
    public Clase3(){
        super("PROTECTED");
        this.atributoProtected = "ACCEDEMOS DESDE LA CLASE HIJA";
        System.out.println("ATRIBUTO PROTECTED = " + this.atributoProtected);
    this.atributoProtected = "ES TOTALMENTE PUBLICO";
    }
    
}
