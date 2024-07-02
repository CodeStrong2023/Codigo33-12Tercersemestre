package test;

import domain.*;

public class TestClaseObjetc {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Jessica", 5000);
        Empleado empleado2 = new Empleado("Jessica", 5000);
        
        if(empleado1 == empleado2){
            System.out.println("TIENEN LA MISMA REFERENCIA EN MEMORIA");
        }
        else{
            System.out.println("TIENEN DISTINTA REFERENCIA EN MEMORIA");
        }
        
        if (empleado1.equals(empleado2)){
            System.out.println("LOS OBJETOS SON IGUALES EN CONTENIDO");
        }
        else{
            System.out.println("LOS OBJETOS SON DISTINTOS EN CONTENIDO");
        }
        
        if (empleado1.hashCode()== empleado2.hashCode()){
            System.out.println("EL VALOR DEL HashCode ES IGUAL");
        }
        else{
            System.out.println("EL VALOR DEL HashCode ES DIFERENTE");
        }
        
    }

    
    

}
