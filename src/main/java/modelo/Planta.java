package modelo;

import java.util.Random;

public class Planta {

    private int codigoPlanta;
    private String nombrePlanta;
    private Suelo suelo;

    public Planta(String nombrePlanta, String categoriaSuelo) {
        setCodigo();
        this.nombrePlanta = nombrePlanta;
        setSuelo(categoriaSuelo);
    }

    public Planta(int codigoPlanta, String nombrePlanta, String categoriaSuelo) {
        this.codigoPlanta = codigoPlanta;
        this.nombrePlanta = nombrePlanta;
        setSuelo(categoriaSuelo);
    }

    private void setSuelo(String categoriaSuelo) {
        this.suelo = Suelo.getSuelo(categoriaSuelo);
    }

    private void setCodigo() {
        this.codigoPlanta = new Random().nextInt();
    }

    public String getTipoSueloYDescripcion() {
        var detallesSuelo = suelo.getCategoria();
        detallesSuelo += " " + suelo.getCategoria();
        return detallesSuelo;
    }
}
