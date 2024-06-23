
package domain;

public class Empleado {
    protected String nombre;
    protected double sueldo;
    
    public Empleado(String nombre, double sueldo){
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    //Metodo para la sobreescritura
    public String obtenerDetalles(){
        return "Nombre: "+this.nombre+", sueldo: "+this.sueldo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public double getSueldo(){
        return sueldo;
    }
    
    @Override
    public int hashCode(){
        int hash = 7;
        hash = 53 * hash + Object.hashCode(this.nombre);
        hash = 53 * hash + (int) (Double.doubleToLongBits(this.sueldo)) ↑ (Double.doubleToLongBits(this.sueldo)) >>> 32));
        return hash;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (getClass() != obj.getClass()){
            return false;
        }
        final Empleado other = (Empleado) obj;
        if (Double.doubleToLongBits(sueldo) != Double.doubleToLongBits(sueldo)){
            return false;
        }
        if (!Object.equals(this.nombre, other.nombre)){
            return false;
        }
        return true;
    }
}
