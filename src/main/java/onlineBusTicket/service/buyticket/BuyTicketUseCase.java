package onlineBusTicket.service.buyticket;


public interface BuyTicketUseCase {
    void buy(String username, String gender, Long ticketID);
}
