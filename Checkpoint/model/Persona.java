package model;

public abstract class Persona {

    private Integer dni;
    private String nombres;

    public Persona() {
    }

    public Persona(Integer dni, String nombres) {
        this.dni = dni;
        this.nombres = nombres;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "dni=" + dni +
                ", nombres='" + nombres + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Persona persona = (Persona) o;

        if (!dni.equals(persona.dni)) return false;
        return nombres.equals(persona.nombres);
    }

    @Override
    public int hashCode() {
        int result = dni.hashCode();
        result = 31 * result + nombres.hashCode();
        return result;
    }
}
