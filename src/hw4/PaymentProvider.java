package hw4;

/**
 * Центр платежей
 */
class PaymentProvider implements IPaymentProvider {

    @Override
    public boolean buyTicket(int orderId, String cardNo, double amount){return true;}

}
