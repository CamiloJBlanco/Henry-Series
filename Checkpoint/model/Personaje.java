package model;

public class Personaje {

    private static Integer key = 1000;
    private Integer Id;
    private Actor actor;
    private String nombrePersonaje;

    public Personaje() {
    }

    public Personaje(Actor actor, String nombrePersonaje) {
        Id = key++;
        this.actor = actor;
        this.nombrePersonaje = nombrePersonaje;
    }

    public static Integer getKey() {
        return key;
    }

    public static void setKey(Integer key) {
        Personaje.key = key;
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Actor getActor() {
        return actor;
    }

    public void setActor(Actor actor) {
        this.actor = actor;
    }

    public String getNombrePersonaje() {
        return nombrePersonaje;
    }

    public void setNombrePersonaje(String nombrePersonaje) {
        this.nombrePersonaje = nombrePersonaje;
    }

    @Override
    public String toString() {
        return "Personaje{" +
                "Id=" + Id +
                ", actor=" + actor +
                ", nombrePersonaje='" + nombrePersonaje + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Personaje personaje = (Personaje) o;

        if (!Id.equals(personaje.Id)) return false;
        if (!actor.equals(personaje.actor)) return false;
        return nombrePersonaje.equals(personaje.nombrePersonaje);
    }

    @Override
    public int hashCode() {
        int result = Id.hashCode();
        result = 31 * result + actor.hashCode();
        result = 31 * result + nombrePersonaje.hashCode();
        return result;
    }
}
