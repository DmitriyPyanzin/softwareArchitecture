package hw2.users;

import hw2.mediator.Mediator;
import hw2.Message;

public class User1 extends User {

    public User1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void notify(Message message) {System.out.println("User1 gets message: " + message.message());}
}
