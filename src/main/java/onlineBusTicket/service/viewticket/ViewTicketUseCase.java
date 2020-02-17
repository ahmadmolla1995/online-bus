package onlineBusTicket.service.viewticket;

import onlineBusTicket.model.Ticket;
import java.util.List;


public interface ViewTicketUseCase {
    List<Ticket> viewAll();
}
