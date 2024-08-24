package hw4;

class CustomerProvider implements ICostumerProvider {

    public CustomerProvider(Database database) {
    }

    @Override
    public Customer getCustomer(String login, String password){
        return new Customer();
    }
}
