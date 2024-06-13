
package test;

import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: "+Dias.LUNES);
        indicarDiasSemana(Dias.LUNES);
    }
    
    private static void indicarDiasSemana(Dias dias){
        switch (dias) {
            case LUNES:
                System.out.println("PRIMER DIA DE LA SEMANA");
                break;
            case MARTES:
                System.out.println("SEGUNDO DIA DE LA SEMANA");
            case MIERCOLES:
                System.out.println("TERCER DIA DE LA SEMANA");
            case JUEVES:
                System.out.println("CUARTO DIA DE LA SEMANA");
            case VIERNES:
                System.out.println("QUINTO DIA DE LA SEMANA");
            case SABADO:
                System.out.println("SEXTO DIA DE LA SEMANA");
            case DOMINGO:
                System.out.println("SEPTIMO DIA DE LA SEMANA");
            default:
                throw new AssertionError();
        }
        
    }
}
