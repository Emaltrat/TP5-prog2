
package ema.tp5.prog2;

public class TP5Prog2 {


    public static void main(String[] args) {
        Usuario usuario1 = new Usuario(1, "Carlos Lopez", "carlos@example.com");
        Tecnico tecnico1 = new Tecnico(1, "Laura Gomez", "Redes");

        TicketSoporte ticket1 = new TicketSoporte(101, "No funciona internet", usuario1);
        ticket1.asignarTecnico(tecnico1.getNombre());

        TicketSoporte ticket2 = new TicketSoporte(102, "Problema con la impresora");
        ticket2.asignarTecnico("Miguel Ramirez");

        SistemaSoporte sistema = new SistemaSoporte(5);
        sistema.agregarTicket(ticket1);
        sistema.agregarTicket(ticket2);

        sistema.listarTickets();

        // Cerrar un ticket
        ticket1.cerrarTicket();

        System.out.println("\n--- Estado despues de cerrar un ticket ---\n");
        sistema.listarTickets();
    }
}
