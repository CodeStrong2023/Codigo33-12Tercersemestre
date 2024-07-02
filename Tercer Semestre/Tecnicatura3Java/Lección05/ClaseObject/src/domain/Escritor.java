
package domain;


public class Escritor extends Empleado{
    final TipoEscritura tipoEscritura;
    
    public Escritor(String nombre, double sueldo, TipoEscritura tipoEscritura1){
        super(nombre, sueldo);
        this.tipoEscritura = tipoEscritura1;
    }
    
    //Metodo para sobreescribir
    @Override
    public String obtenerDetalles(){
        return super.obtenerDetalles()+", Tipo Escritura: "+tipoEscritura.getDescripcion();
    }
    
    @Override
    public String toString(){
        return "Escritor{" + "tipoEscritura=" + tipoEscritura + '}'+" "+super.toString();
    }
    
    public TipoEscritura getTipoEscritura(){
        return this.tipoEscritura;
    }
}
