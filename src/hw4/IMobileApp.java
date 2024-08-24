package hw4;

import java.util.Collection;
import java.util.Date;

interface IMobileApp {

    Collection<Ticket> getTickets();
    void searchTicket(Date date);
    boolean buyTicket(String number);

}
