package model;

import interfaces.IAcciones;

import java.util.List;

public class Serie implements IAcciones {

    private Integer id;
    private String titulo;
    private String genero;
    private Integer anio; //año
    private String sinopsis;
    private List<Temporada> temporadas;
    private List<Personaje> personajes;

    public Serie() {
    }

    public Serie(Integer id, String titulo, String genero, Integer anio, String sinopsis, List<Temporada> temporadas, List<Personaje> personajes) {
        this.id = id;
        this.titulo = titulo;
        this.genero = genero;
        this.anio = anio;
        this.sinopsis = sinopsis;
        this.temporadas = temporadas;
        this.personajes = personajes;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }

    public List<Personaje> getPersonajes() {
        return personajes;
    }

    public void setPersonajes(List<Personaje> personajes) {
        this.personajes = personajes;
    }


    @Override
    public String toString() {
        return "Serie{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", genero='" + genero + '\'' +
                ", anio=" + anio +
                ", sinopsis='" + sinopsis + '\'' +
                ", temporadas=" + temporadas +
                ", personajes=" + personajes +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Serie serie = (Serie) o;

        if (!id.equals(serie.id)) return false;
        if (!titulo.equals(serie.titulo)) return false;
        if (!genero.equals(serie.genero)) return false;
        if (!anio.equals(serie.anio)) return false;
        if (!sinopsis.equals(serie.sinopsis)) return false;
        if (!temporadas.equals(serie.temporadas)) return false;
        return personajes.equals(serie.personajes);
    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + titulo.hashCode();
        result = 31 * result + genero.hashCode();
        result = 31 * result + anio.hashCode();
        result = 31 * result + sinopsis.hashCode();
        result = 31 * result + temporadas.hashCode();
        result = 31 * result + personajes.hashCode();
        return result;
    }

    @Override
    public void Agregar(Object o) throws Exception {
        if(o instanceof Temporada){
            temporadas.add((Temporada) o);
        } else if( o instanceof Personaje){
            if(!personajes.contains(o)){
                personajes.add((Personaje) o);
            }else{
                throw new Exception("El personaje ya existe");
            }
        }
    }

    @Override
    public Object Buscar(Integer i) {
        if(i < 1000){
            for(Temporada t: temporadas){
                if(t.getId() == i){
                    return t;
                }
            }
        } else {
            for(Personaje p: personajes){
                if(p.getId() == i){
                    return p;
                }
            }
        }
        return null;
    }

    @Override
    public void Quitar(Object o) throws Exception {
        if (o instanceof Temporada) {
            if (temporadas.contains(o)) {
                temporadas.remove(o);
            }
            else {
                throw new Exception("La temporada no existe");

            }
        }else if(o instanceof Personaje){
            if(personajes.contains(o)){
                personajes.remove(o);
            }
        } else {
            throw new Exception("El personaje no existe");
        }
    }
}

