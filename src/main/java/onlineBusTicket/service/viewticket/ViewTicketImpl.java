package onlineBusTicket.service.viewticket;

import onlineBusTicket.model.Ticket;
import onlineBusTicket.repositories.TicketRepository;
import java.util.List;


public class ViewTicketImpl implements ViewTicketUseCase {
    @Override
    public List<Ticket> viewAll() {
        return TicketRepository.getInstance().findAll();
    }
}
