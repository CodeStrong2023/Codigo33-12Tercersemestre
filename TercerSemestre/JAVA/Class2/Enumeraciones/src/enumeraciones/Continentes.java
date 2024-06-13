package enumeraciones;

public enum Continentes {
    ASIA(51, "4.700.000.000 cuatro mil setecientos millones de habitantes aprox"),
    AFRICA(54, "1.400.000.000 mil cuatrocientos millones de habitantes aprox"),
    EUROPA(44, "700.000.000 setecientos millones de habitantes aprox"),
    AMERICA(35, "1.000.000.000 mil millones de habitantes aprox"),
    ANTARTIDA(7, "Entre 1000-5000 temporalmente de habitantes"),
    OCEANIA(14, "41.000.000 cuarenta y un millones de habitantes aprox");

    private final int paises;
    private String habitantes;

    private Continentes(int paises, String habitantes) {
        this.paises = paises;
        this.habitantes = habitantes;
    }

    //METODO GET
    public int getPaises() {
        return this.paises;

    }

    public String getHabitantes() {
        return this.habitantes;
    }

}
