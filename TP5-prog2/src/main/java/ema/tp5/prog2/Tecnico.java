
package ema.tp5.prog2;

public class Tecnico {
    private int id;
    private String nombre;
    private String especialidad;

    public Tecnico(int id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "Tecnico{id=" + id + ", nombre='" + nombre + "', especialidad='" + especialidad + "'}";
    }
}
