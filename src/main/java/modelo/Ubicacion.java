package modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ubicacion {

    private int codigo;
    private int nombre;
    private List<Planta> plantas;

    public Ubicacion(int codigo, int nombre) {
        setCodigo();
        this.nombre = nombre;
        this.plantas = new ArrayList<Planta>();
    }

    public Ubicacion(int codigo, int nombre, List<Planta> plantas) {
        setCodigo();
        this.nombre = nombre;
        this.plantas = plantas;
    }

    private void setCodigo() {
        this.codigo = new Random().nextInt();
    }

    public void addPlanta(Planta planta) {
        plantas.add(planta);
    }

    public void removePlanta(Planta planta) {
        plantas.remove(planta);
    }
}
