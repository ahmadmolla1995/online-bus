package onlineBusTicket.service.buyticket;

import onlineBusTicket.model.Ticket;
import onlineBusTicket.repositories.TicketRepository;


public class BuyTicketImpl implements BuyTicketUseCase {
    @Override
    public void buy(String username, String gender, Long ticketID) {
        TicketRepository ticketRepository = TicketRepository.getInstance();
        ticketRepository.save(new Ticket());
    }
}
