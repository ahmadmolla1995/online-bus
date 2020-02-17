package onlineBusTicket.service.searchticket;

import onlineBusTicket.model.Ticket;
import onlineBusTicket.repositories.TicketRepository;
import java.util.List;


public class SearchTicketImpl implements SearchTicketUseCase {
    @Override
    public List<Ticket> getTickets(String origin, String destination, String departureDate) {
        return TicketRepository.getInstance().findAll();
    }
}
