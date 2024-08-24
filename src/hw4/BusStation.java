package hw4;

/**
 * Автобусная станция
 */
class BusStation implements IBusStation {

    private final TicketProvider ticketProvider;

    public BusStation(TicketProvider ticketProvider) {this.ticketProvider = ticketProvider;}

    @Override
    public boolean checkTickets(String qrcode) {return ticketProvider.checkTicket(qrcode);}

}
