package hw4;

import java.util.Collection;
import java.util.Date;

public class Program {

    /**
     * Разработать контракты и компоненты системы "Покупка онлайн билетов на автобус в час пик"
     * 1.   Предусловия
     * 2.   Постусловия
     * 3.   Инварианты
     * 4.   Определеть абстрактные и конкретные классы
     * 5.   Определить интерфейсы
     * 6.   Реализовать наследование
     * 7.   Выявить компоненты
     * 8.   Разработать Диаграмму компонента используя нотацию UML 2.0 Общая без деталей
     */
    public static void main(String[] args) {

        Core core = new Core();
        MobileApp mobileApp = new MobileApp(core.getTicketProvider(), core.getCustomerProvider());
        BusStation busStation = new BusStation(core.getTicketProvider());

        if (mobileApp.buyTicket("1100000022123456")){
            System.out.println("Клиент успешно купил билет");
            mobileApp.searchTicket(new Date());
            Collection<Ticket> tickets = mobileApp.getTickets();
            if (busStation.checkTickets(tickets.stream().findFirst().get().getQrcode())){
                System.out.println("Клиент успешно прошёл в автобус");
            }
        }


    }

}
