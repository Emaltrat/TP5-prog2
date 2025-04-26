
package ema.tp5.prog2;

public class SistemaSoporte {
    private TicketSoporte[] tickets;
    private int cantidad;

    public SistemaSoporte(int capacidad) {
        tickets = new TicketSoporte[capacidad];
        cantidad = 0;
    }

    public void agregarTicket(TicketSoporte ticket) {
        if (cantidad < tickets.length) {
            tickets[cantidad] = ticket;
            cantidad++;
        } else {
            System.out.println("No se pueden agregar más tickets.");
        }
    }

    public void listarTickets() {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(tickets[i]);
            System.out.println("--------------------------");
        }
    }
}
