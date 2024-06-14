package paquete1;

class Clase2 {

    String atributoDefault = "VALOR DEL ATRIBUTO DEFAULT";

    Clase2() {
        System.out.println("CONSTRUCTOR DEFAULT");

    }

    /*public Clase2(){
        super();
        this.atributoDefault = "MODIFICACION DEL ATRIBUTO DEFAULT";
        System.out.println("ATRIBUTO DEFAULT = " + atributoDefault);
        this.metodoDefault();
    }*/
    
    void metodoDefault() {
        System.out.println("METODO DEFAULT");
    }

}
