
package paquete1;


public class ClaseHija2 extends Clase2{
    public ClaseHija2(){
        super();
        this.atributoDefault = "MODIFICACION DEL ATRIBUTO DEFAULT ";
        System.out.println("ATRIBUTO DEFAULT = " + this.atributoDefault);
        this.metodoDefault();
    }
    
}
