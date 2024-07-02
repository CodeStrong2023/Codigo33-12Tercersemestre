
package test;

import enumeraciones.Continentes;
import enumeraciones.Dias;


public class TestEnumeraciones {
    public static void main(String[] args){
        //System.out.println("Dia 1: "+Dias.LUNES);  
        //indicarDiaSemana(Dias.LUNES);//las enumeraciones se tratan como cadenas
        //Ahora no se deben utilizar comillas, se accede através del operador de punto
        System.out.println("Continentes No. 4: "+Continentes.AMÉRICA);
        System.out.println("No. de paises en el 4to. continente: "+Continentes.AMÉRICA.getPaises());
        System.out.println("No. de habitantes en el 4to. continente: "+Continentes.AMÉRICA.getHabitantes());
    }
    
    private static void indicarDiaSemana(Dias dias){
           switch(dias){ 
            case LUNES:
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");
                break;
            case MIÉRCOLES:
                System.out.println("Tercer dia de la semana");
                break;
            case JUEVES:
                System.out.println("Cuarto dia de la semana");
                break;
            case VIERNES:
                System.out.println("Quinto dia de la semana");
                break;
            case SÁBADO:
                System.out.println("Sexto dia de la semana");
                break;
            case DOMINGO:
                System.out.println("Séptimo dia de la semana");
    }
        }
    }


   