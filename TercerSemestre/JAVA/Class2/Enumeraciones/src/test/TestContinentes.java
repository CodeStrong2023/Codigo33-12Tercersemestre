package test;

import enumeraciones.Continentes;

public class TestContinentes {

    public static void main(String[] args) {
        System.out.println("Continente No. 4: " + Continentes.AMERICA);
        System.out.println("No. de paises en el 4to continente: " + Continentes.AMERICA.getPaises());
        System.out.println("No. de habitantes en el 4to continente: " + Continentes.AMERICA.getHabitantes());
    }

}
