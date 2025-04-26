
package ema.tp5.prog2;

import java.time.LocalDate;

public class TicketSoporte {
    private int id;
    private String descripcion;
    private String estado;
    private LocalDate fechaCreacion;
    private Usuario usuario;
    private String tecnico;  

    // Constructor SIN usuario
    public TicketSoporte(int id, String descripcion) {
        this.id = id;
        this.descripcion = descripcion;
        this.estado = "Abierto";
        this.fechaCreacion = LocalDate.now();
    }

    // Constructor CON usuario
    public TicketSoporte(int id, String descripcion, Usuario usuario) {
        this(id, descripcion);
        this.usuario = usuario;
    }

    public void cerrarTicket() {
        this.estado = "Cerrado";
    }

    public void asignarTecnico(String tecnico) {
        this.tecnico = tecnico;
    }

    public String mostrarDetalle() {
        String detalle = "Ticket ID: " + id + "\n"
                       + "Descripcion: " + descripcion + "\n"
                       + "Estado: " + estado + "\n"
                       + "Fecha de Creacion: " + fechaCreacion + "\n";
        if (usuario != null) {
            detalle += "Usuario: " + usuario.getNombre() + " (" + usuario.getEmail() + ")\n";
        } else {
            detalle += "Usuario: No asignado\n";
        }
        if (tecnico != null) {
            detalle += "Tecnico asignado: " + tecnico + "\n";
        } else {
            detalle += "Tecnico asignado: No asignado\n";
        }
        return detalle;
    }

    @Override
    public String toString() {
        return mostrarDetalle();
    }
}

