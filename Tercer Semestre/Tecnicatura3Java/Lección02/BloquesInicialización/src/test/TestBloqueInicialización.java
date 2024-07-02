
package test;

import domain.Persona;


public class TestBloqueInicialización {
    public static void main(String[] args){
        Persona personal = new Persona();
        System.out.println("personal = " + personal);
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
    }
}
