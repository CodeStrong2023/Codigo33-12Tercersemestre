package  java.Leccion1.Mundopc;

public class DispositivoEntrada {

    private String tipoEntrada;
    private String marca;

    public DispositivoEntrada (String tipoEntrada, String marca){
        this.tipoEntrada = tipoEntrada;
        this.marca = marca;
    }

    // get and set tipoEntrada
    public String getTipoEntrada(){
        return this.tipoEntrada;
    }
    public void setTipoentrada(String tipoEntrada){
        this.tipoEntrada = tipoEntrada;
    }

    //get and set Marca
    public String getMarca(){
        return this.marca;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }

    public String toString(){
        return "DispositivoEntrada{ " + "tipoEntrada = " + tipoEntrada + ", Marca = " + marca +"}";
    }

}