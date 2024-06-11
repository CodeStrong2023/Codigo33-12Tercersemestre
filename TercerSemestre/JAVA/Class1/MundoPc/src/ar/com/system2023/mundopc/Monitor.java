package ar.com.system2023.mundopc;

public class Monitor {

    private final int idMonitor;
    private String marca;
    private double tamanio;
    private static int contadorMonitores;

    private Monitor(){
        this.idMonitor = ++Monitor.contadorMonitores;
    }

    public Monitor(String marca, double tamanio) {
        this(); //LLAMAMOS AL CONTRUCTOR VACIO
        this.marca = marca;
        this.tamanio = tamanio;
    }

    //GET Y SET
    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(double tamanio) {
        this.tamanio = tamanio;
    }

    //SE INGRESA MANUALMENTE EL GET ID MONITOR
    public int getidMonitor() {
        return this.idMonitor; //se le reasigna un valor cuando llamamos al contructor vacio
    }

    @Override
    public String toString() {
        return "Monitor{" + "idMonitor=" + idMonitor + ", marca=" + marca + ", tamanio=" + tamanio + '}';
    }

}
