package paquete1;

public class Clase1 {

    public String atributopublic = "valor atributo public";
    protected String atributoProtected = "VALOR ATRIBUTO PROTECTED";

    public Clase1() {
        System.out.println("CONSTRUCTOR PUBLIC");
    }

    protected  Clase1(String atributoPublic){
        System.out.println("CONSTRUCTOR PROTECTED");
    }
    public void metodoPublico() {
        System.out.println("METODO PUBLIC");
    }
    
    protected void metodoProtected(){
        System.out.println("METODO PROTECTED");
    }
}
