package hw4;

interface IPaymentProvider {

    boolean buyTicket(int orderId, String cardNo, double amount);

}
