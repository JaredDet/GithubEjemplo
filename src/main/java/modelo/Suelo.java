package modelo;

public enum Suelo {

    A("A", "Arenisca"), B("B", "Arenisca/Caliza"), C("C", "Caliza");

    private final String categoria;
    private final String descripcion;

    Suelo(String categoria, String descripcion) {
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public static Suelo getSuelo(String categoriaSolicitada) {
        for (var suelo : values()) {
            if (categoriaSolicitada.toLowerCase()
                    .equals(suelo.categoria.toLowerCase())) {
                return suelo;
            }
        }
        throw new IllegalArgumentException();
    }

    public String getCategoria(){
        return categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
