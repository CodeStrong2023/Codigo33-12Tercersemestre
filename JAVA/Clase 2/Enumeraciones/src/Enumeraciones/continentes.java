package TercerSemestreee.Java.Leccion02.Enumeraciones;

public enum continentes {
    AFRICA(53,"1.2 billones"),
    EUROPA(46,"1.1 billones"),
    ASIA(44,"1.9 millones"),
    AMERICA(34,"150.2 millones"),
    OCEANIA(14,"1.2 billones");

    private final int paises;
    private String habitantes;

    continentes (int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises(){
        return this.paises;
    }

    public String getHabitantes(){
        return this.habitantes;
    }
}
