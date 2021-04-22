package model;

public class Actor extends Persona{

    private String apellido;

    public Actor() {
    }

    public Actor(Integer dni, String nombres, String apellido) {
        super(dni, nombres);
        this.apellido = apellido;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public String toString() {
        return "Actor{" +
                "apellido='" + apellido + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        Actor actor = (Actor) o;

        return apellido.equals(actor.apellido);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + apellido.hashCode();
        return result;
    }
}
