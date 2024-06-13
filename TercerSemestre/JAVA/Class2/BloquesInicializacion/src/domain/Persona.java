package domain;

public class Persona {

    private final int idPersona;
    private static int contadorPersonas;

    static { //BLOQUE INICIALIZACION ESTATICO
        System.out.println("EJECUCION DE BLOQUE ESTATICO");
        ++Persona.contadorPersonas;
        // idPersona = 10; ATRIBUTO NO ESTATICO 
    }

    { //BLOQUE INICIALIZACION NO ESTATICO(CONTEXTO DINAMICO)
        System.out.println("EJECUCION DEL BLOQUE NO ESTATICO");
        this.idPersona = Persona.contadorPersonas++; //INCREMENTAMOS ATRIBUTO
    }
    //LOS BLOQUES DE INICIALIZACION SE EJECUTAN ANTES DEL CONSTRUCTOR

    public Persona() {
        System.out.println("EJECUCION DEL CONSTRUCTOR");
    }

    public int getIdPersona() {
        return this.idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }

}
