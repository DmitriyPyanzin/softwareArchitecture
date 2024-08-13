package hw2.users;

import hw2.mediator.Mediator;
import hw2.Message;

public class User2 extends User {

    public User2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(Message message) {
        System.out.println("User2 gets message: " + message.getMessage());
    }
}
