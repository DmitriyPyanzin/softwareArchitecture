package hw4;

class Core implements ICore{

    private final CustomerProvider customerProvider;
    private final TicketProvider ticketProvider;

    public Core(){
        Database database = new Database();
        customerProvider = new CustomerProvider(database);
        PaymentProvider paymentProvider = new PaymentProvider();
        ticketProvider = new TicketProvider(database, paymentProvider);
    }
    @Override
    public TicketProvider getTicketProvider() {return ticketProvider;}

    @Override
    public CustomerProvider getCustomerProvider() {return customerProvider;}
}
