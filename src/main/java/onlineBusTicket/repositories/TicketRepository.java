package onlineBusTicket.repositories;

import onlineBusTicket.model.Ticket;


public class TicketRepository extends CRUDRepository<Ticket, Long> {
    private static TicketRepository ticketRepository;

    private TicketRepository() {}

    @Override
    protected Class<Ticket> getEntityClass() {
        return Ticket.class;
    }

    public static TicketRepository getInstance() {
        if (ticketRepository == null)
            ticketRepository = new TicketRepository();
        return ticketRepository;
    }
}
