
package enumeraciones;


public enum Continentes {
    ÁFRICA(53, "1.2 billones"),
    EUROPA(46, "1.1 billones"),
    ASIA(44, "1.9 billones"),
    AMÉRICA(34, "150.2 billones"),
    OCEANÍA(14, "1.2 billones");
    
    private final int paises;
    private String habitantes;
    
    Continentes(int paises, String habitantes){
       this.paises = paises;
       this.habitantes = habitantes; 
}
    
    //Método Get
    public int getPaises(){
     return this.paises;
}

   public String getHabitantes(){
       return this.habitantes;
   }
   }