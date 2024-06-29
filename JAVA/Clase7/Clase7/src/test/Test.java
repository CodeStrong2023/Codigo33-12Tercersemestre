package test;

import domain.Persona;

public class Test{
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Klaus");
        System.out.println("Nombre persona: " + persona.getNombre());
        System.out.println("Apellido persona: " + persona.getApellido());
    }
}
