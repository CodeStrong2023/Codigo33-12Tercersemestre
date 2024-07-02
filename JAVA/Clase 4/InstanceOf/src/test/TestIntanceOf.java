package test;

import domain.*;

public class TestIntanceOf {

    public static void main(String[] args) {

        Empleado empleado1 = new Empleado("Jose", 10000);
        determinarTipo(empleado1);

        empleado1 = new Gerente("Jessica", 5000, "Sistemas");
        //determinarTipo(empleado1);

    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println("Es de tipo Gerente");
            Gerente gerente = (Gerente) empleado;
            //((Gerente) empleado).getDepartamento();
            System.out.println("Gerente =  " + gerente.getDepartamento());

        } else if (empleado instanceof Empleado) {
            System.out.println("ES de tipo Empleado");
            //Gerente gerente = (Gerente) empleado;
            //System.out.println("Gerente =  " + gerente.getDepartamento());

        } else if (empleado instanceof Object) {
            System.out.println("Es de tipo Objetc");
        }
    }

}
