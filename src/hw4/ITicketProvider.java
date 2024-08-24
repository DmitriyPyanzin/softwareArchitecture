package hw4;

import java.util.ArrayList;
import java.util.Date;

interface ITicketProvider {

    ArrayList<Ticket> searchTicket(int clientId, Date date);
    boolean buyTicket(int clientId, String cardNo);
    boolean checkTicket(String qrcode);

}
