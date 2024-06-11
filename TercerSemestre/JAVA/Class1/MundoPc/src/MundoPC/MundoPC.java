
package MundoPC;
import ar.com.system2023.mundopc.*;

public class MundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13); //IMPORTAR CLASE 
        Teclado tecladoHP = new Teclado("Bluetooh", "HP");
        Raton ratonHP = new Raton("Bluetooh", "HP");
        Computadora computadoraHP = new Computadora("computadora HP", monitorHP, tecladoHP, ratonHP);
        
        
        //SE CREA OTROS OBJETOS DIFERENTES DE MARCAS
        Monitor monitorGamer = new Monitor("Gamer", 32);
        Teclado tecladoGamer = new Teclado("Bluetooh", "Gamer");
        Raton ratonGamer = new Raton("Bluetooh", "Gamer");
        Computadora computadoraGamer = new Computadora("computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        
        
       
        // CREAR MAS OBJETOS DE TIPO COMPUTADORA
        //COMPLETAR UNA LISTA 
        //PROBAR DE ES MANERA LOS METODOS
        
        Monitor monitorLG = new Monitor("LG", 32);
        Teclado tecladoLG = new Teclado("Bluetooh", "LG");
        Raton ratonLG = new Raton("Bluetooh", "LG");
        Computadora computadoraLG = new Computadora("computadora LG", monitorLG, tecladoLG, ratonLG);
        
        Monitor monitorSAMSUNG = new Monitor("SAMSUNG", 13);
        Teclado tecladoSAMSUNG = new Teclado("Bluetooh", "SAMSUNG");
        Raton ratonSAMSUNG = new Raton("Bluetooh", "SAMSUNG");
        Computadora computadoraSAMSUNG = new Computadora("computadora SAMSUNG", monitorSAMSUNG, tecladoSAMSUNG, ratonSAMSUNG);
        
        Orden orden1 = new Orden(); //INICIALIZAMOS ARREGLO VACIO
        Orden orden2 = new Orden(); //NUEVA LISTA PARA OBJETO 2
        Orden orden3 = new Orden();
        Orden orden4 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden2.agregarComputadora(computadoraGamer);
        orden3.agregarComputadora(computadoraLG);
        orden4.agregarComputadora(computadoraSAMSUNG);
        
        //Computadora computadoraVarias= new Computadora("Computadora de diferentes marcas", monitorHP, tecladoGamer, ratonHP);
        //orden2.agregarComputadora(computadoraVarias);
        
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        orden3.mostrarOrden();
        orden4.mostrarOrden();
    }
    
}
