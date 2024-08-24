package hw4;

import java.util.ArrayList;
import java.util.Collection;

/**
 * База данных
 */
class Database implements IDatabase{

    private static int counter;
    private final Collection<Ticket> tickets = new ArrayList<>();
    private final Collection<Customer> customers = new ArrayList<>();

    public Database(){
        tickets.add(new Ticket());
        tickets.add(new Ticket());
        tickets.add(new Ticket());
    }

    @Override
    public Collection<Ticket> getTickets() {return tickets;}

    @Override
    public Collection<Customer> getCustomers() {return customers;}

    /**
     * Получить актуальную стоимость билета
     * @return возврат цены
     */
    @Override
    public double getTicketAmount() {return 45;}

    /**
     * Получить идентификатор заявки на покупку билета
     * @return возврат id
     */
    @Override
    public int createTicketOrder(int clientId) {return ++counter;}

}
