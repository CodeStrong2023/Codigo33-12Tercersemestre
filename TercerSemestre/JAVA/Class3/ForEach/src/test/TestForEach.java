package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {5, 6, 8, 9}; //SINTAXIS RESUMIDA
        //for (int i = 0; i < edades.length; i++){  }
        for (int edad : edades) { //SINTAXIS FOREACH
            System.out.println("EDAD = " + edad);

        }
        Persona personas[] = {new Persona("Ayelen"), new Persona("Natalia"),
             new Persona("Jessica")};
        
        for(Persona persona: personas){
            System.out.println("persona = "+persona);
            
        }

    }

}
