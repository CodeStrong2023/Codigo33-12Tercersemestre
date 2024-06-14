package paquete2;

public class Clase4 {

    private String atributoPrivate = "ATRIBUTO PRIVADO";

    private Clase4() {
        System.out.println("CONSTRUCTOR PRIVADO");
    }

    //SE CREA UN CONSTRUCTOR PUBLIC PARA PODER CREAR OBJETOS 
    public Clase4(String argumento) { //AQUI SE LLAMA AL CONSTRUCTOR VACIO
        this();
        System.out.println("CONSTRUCTOR PUBLICO");
    }

    //METODO PRIVATE
    private void metodoPrivado() {
        System.out.println("METODO PRIVADO");
    }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }

}
