package principal;

public class Texto {

    private final int MAXCADENA;
    private final String VOCALES = "aeiouáéíóú";
    private char caracter;
    private String cadena;

    public Texto( int MAXCADENA) {

        this.MAXCADENA =  MAXCADENA;

    }



    public char getCaracter() {
        return caracter;
    }

    public void setCaracter(char caracter) {
        this.caracter = caracter;
    }

    public String getCadena() {
        return cadena;
    }

    public void setCadena(String cadena) {
        this.cadena = cadena;
    }
}