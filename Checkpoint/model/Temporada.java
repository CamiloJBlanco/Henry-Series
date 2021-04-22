package model;

import java.util.List;

public class Temporada {

    private static Integer idGlobal = 0;
    private Integer Id;
    private Integer numero;
    private Integer anio; //año
    private Boolean iniciada;
    private Boolean terminada;
    private List<Capitulo> capitulos;

    public void agregarCapitulo(Capitulo capitulo){
        if(!capitulos.contains(capitulo)) {
            capitulos.add(capitulo);
        }
    }

    public int capitulosVistos(){
        int cantidad = 0;
        for(Capitulo capitulo: capitulos){
            if(capitulo.getVisto()){
                cantidad ++;
            }
        }
        return cantidad;
    }

    public Integer eliminarTemporada(Object o) throws Exception {
        return null;
    }

    public Temporada() {
    }

    public Temporada(Integer numero, Integer anio, Boolean iniciada, Boolean terminada, List<Capitulo> capitulos) {
        this.Id = idGlobal++;
        this.numero = numero;
        this.anio = anio;//año
        this.iniciada = iniciada;
        this.terminada = terminada;
        this.capitulos = capitulos;
    }

    public static Integer getIdGlobal() {
        return idGlobal;
    }

    public static void setIdGlobal(Integer idGlobal) {
        Temporada.idGlobal = idGlobal;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        this.Id = id;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Boolean getIniciada() {
        return iniciada;
    }

    public void setIniciada(Boolean iniciada) {
        this.iniciada = iniciada;
    }

    public Boolean getTerminada() {
        return terminada;
    }

    public void setTerminada(Boolean terminada) {
        this.terminada = terminada;
    }

    public List<Capitulo> getCapitulos() {
        return capitulos;
    }

    public void setCapitulos(List<Capitulo> capitulos) {
        this.capitulos = capitulos;
    }

    @Override
    public String toString() {
        return "Temporada{" +
                "id=" + Id +
                ", numero=" + numero +
                ", anio=" + anio +
                ", iniciada=" + iniciada +
                ", terminada=" + terminada +
                ", capitulos=" + capitulos +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Temporada temporada = (Temporada) o;

        if (!Id.equals(temporada.Id)) return false;
        if (!numero.equals(temporada.numero)) return false;
        if (!anio.equals(temporada.anio)) return false;
        if (!iniciada.equals(temporada.iniciada)) return false;
        if (!terminada.equals(temporada.terminada)) return false;
        return capitulos.equals(temporada.capitulos);
    }

    @Override
    public int hashCode() {
        int result = Id.hashCode();
        result = 31 * result + numero.hashCode();
        result = 31 * result + anio.hashCode();
        result = 31 * result + iniciada.hashCode();
        result = 31 * result + terminada.hashCode();
        result = 31 * result + capitulos.hashCode();
        return result;
    }


}
