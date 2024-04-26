
package mundopc;

public class mundoPC {
    public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP",13);
        Teclado tecladoHP = new Teclado("Bluetooth", "HP");
        Raton ratonHP = new Raton("Bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP);
        
        //Creamos otros objetos de distinta marca
        Monitor monitorGamer = new Monitor("Gamer",13);
        Teclado tecladoGamer = new Teclado("Bluetooth", "Gamer");
        Raton ratonGamer = new Raton("Bluetooth", "Gamer");
        Computadora computadoraGamer = new Computadora("Computadora Gamer", monitorGamer, tecladoGamer, ratonGamer);
        Orden orden1 = new Orden();
        Orden orden2 = new Orden();
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraGamer);
        orden1.mostrarOrden();
        
        Computadora computadorasVarias = new Computadora("Computadora de diferentes marcas");
        orden2.agregarComputadora(computadorasVariass);
        
        orden1.mostrarOrden();
        orden2.mostrarOrden();
        
        //changes for commit
    }
}
