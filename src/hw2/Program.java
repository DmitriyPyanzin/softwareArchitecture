package hw2;

import hw2.mediator.ConcreteMediator;
import hw2.users.*;

public class Program {

    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        User1 u1 = new User1(mediator);
        User2 u2 = new User2(mediator);

        mediator.setUser1(u1);
        mediator.setUser2(u2);

        u1.send(u2, new Message("Как твои дела?"));
        u2.send(u1, new Message("Отлично, а у тебя?"));
    }
}
