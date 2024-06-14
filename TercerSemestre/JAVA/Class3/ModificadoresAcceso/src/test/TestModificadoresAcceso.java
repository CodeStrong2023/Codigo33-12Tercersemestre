
package test;

import paquete1.Clase1;
import paquete2.Clase3;


public class TestModificadoresAcceso {
    public static void main(String[] args) {
        Clase1 clase1 = new Clase1();
        System.out.println("CLASE 1 = " + clase1.atributopublic);
        clase1.metodoPublico();
        Clase3 claseHija = new Clase3();
        System.out.println("CLASE HIJA = " + claseHija);
    }
    
}
