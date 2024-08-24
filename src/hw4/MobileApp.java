package hw4;

import java.util.Collection;
import java.util.Date;

/**
 * Мобильное приложение
 */
public class MobileApp implements IMobileApp{

    private final Customer customer;
    private final TicketProvider ticketProvider;

    MobileApp(TicketProvider ticketProvider, CustomerProvider customerProvider) {
        this.ticketProvider = ticketProvider;
        customer = customerProvider.getCustomer("<login>", "<password>");
    }

    @Override
    public Collection<Ticket> getTickets(){return customer.getTickets();}

    @Override
    public void searchTicket(Date date){
        customer.setTickets(ticketProvider.searchTicket(customer.getId(), new Date()));
    }

    @Override
    public boolean buyTicket(String number) {

        // Предусловия

        if (number.length() != 16) throw new RuntimeException("Введен неверный номер карты");

        return true;
    }
}
