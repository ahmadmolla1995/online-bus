package onlineBusTicket.model;

import javax.persistence.*;


@Entity @Table
public class Ticket {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long tripID;

    @Column(nullable = false)
    private String origin;

    @Column(nullable = false)
    private String destination;

    @Column(nullable = false)
    private String departureDate;

    @Column(nullable = false)
    private String departureTime;


    public Ticket() {}

    public Ticket(Long tripID, String origin, String destination, String departureDate, String departureTime) {
        this.tripID = tripID;
        this.origin = origin;
        this.destination = destination;
        this.departureDate = departureDate;
        this.departureTime = departureTime;
    }


    public Long getId() {
        return id;
    }

    public Long getTripID() {
        return tripID;
    }

    public String getOrigin() {
        return origin;
    }

    public String getDestination() {
        return destination;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public String getDepartureTime() {
        return departureTime;
    }
}
