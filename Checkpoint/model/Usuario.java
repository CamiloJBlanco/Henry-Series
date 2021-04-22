package model;

import java.util.List;

public class Usuario extends Persona {

    private List<Serie> series;

    public void agregarSerie(Serie serie) throws Exception {
        if(!series.contains(serie)) {
            series.add(serie);
        } else {
            throw new Exception("La serie ya está agregada");
        }
    }

    public void verCapitulo(Serie serie) throws Exception {
        for(Serie s: series){
            List<Temporada> temporadas = serie.getTemporadas();
            for(Temporada temporada: temporadas){
                if(temporada.getIniciada() || temporada.getTerminada()){
                    throw new Exception("Esta temporada ya fue vista");
                } else {
                    List<Capitulo> capitulos = temporada.getCapitulos();
                    for(Capitulo capitulo: capitulos){
                        if(!capitulo.getVisto()){
                            System.out.println(capitulo);
                        } else {
                            throw new Exception("Este Capitulo ya fue visto");
                        }
                    }
                }
            }
        }
        throw new Exception("Esta serie ya fue vista");
    }

    public int cantidadCapitulosVistos(){
        int acc = 0;
        for (Serie serie: series){
            List<Temporada> temporadas = serie.getTemporadas();
                for(Temporada temporada: temporadas){
                    acc += temporada.capitulosVistos();
                }
        }
        return acc;
    }

    public void listarContinuarViendo(Serie serie) throws Exception {
        List<Temporada> temporadas = serie.getTemporadas();
            for(Temporada temporada: temporadas){
                if(temporada.getIniciada() || !temporada.getTerminada()){
                    List<Capitulo> capitulos = temporada.getCapitulos();
                    for(Capitulo capitulo: capitulos){
                        if(capitulo.getVisto()){
                            System.out.println("Serie: " + serie + "- Temporada: " + temporada + "- Capítulo: " + capitulo);
                        }
                    }
                } else{
                    throw new Exception("Esta temporada ya fue vista");
                }
            }
            throw new Exception("Esta serie ya fue vista");
    }

    public Usuario() {
    }

    public Usuario(Integer dni, String nombres, List<Serie> series) {
        super(dni, nombres);
        this.series = series;
    }

    public List<Serie> getSeries() {
        return series;
    }

    public void setSeries(List<Serie> series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "series=" + series +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Usuario usuario = (Usuario) o;

        return series.equals(usuario.series);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + series.hashCode();
        return result;
    }
}
