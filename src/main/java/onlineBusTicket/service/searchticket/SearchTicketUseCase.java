package onlineBusTicket.service.searchticket;

import onlineBusTicket.model.Ticket;
import java.util.List;


public interface SearchTicketUseCase {
    List<Ticket> getTickets(String origin, String destination, String departureDate);
}
