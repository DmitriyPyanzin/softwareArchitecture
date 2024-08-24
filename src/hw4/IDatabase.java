package hw4;

import java.util.Collection;

interface IDatabase {

    Collection<Ticket> getTickets();
    Collection<Customer> getCustomers();
    double getTicketAmount();
    int createTicketOrder(int clientId);

}
