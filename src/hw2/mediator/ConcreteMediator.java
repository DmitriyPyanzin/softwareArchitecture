package hw2.mediator;

import hw2.users.*;
import hw2.Message;

public class ConcreteMediator extends Mediator {

    private User1 user1;
    private User2 user2;

    public void setUser1(User1 user) {this.user1 = user;}

    public void setUser2(User2 user) {this.user2 = user;}

    @Override
    public void send(User user, Message message) {
        if (user.equals(user1)) user2.notify(message);
        else user1.notify(message);
    }
}
