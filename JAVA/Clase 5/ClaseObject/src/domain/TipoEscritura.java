
package domain;

public enum TipoEscritura {
    ClASICO ("Escritura a mano"),
    MODERNO ("Escritura digital");
    
    private final String descripcion;
    
    private TipoEscritura(String descripcion){
        this.descripcion = descripcion;
    }
    
    //Metodo get
    public String getDescripcion(){
        return this.descripcion;
    }
}
