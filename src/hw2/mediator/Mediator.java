package hw2.mediator;

import hw2.Message;
import hw2.users.User;

public abstract class Mediator {

    public abstract void send(User user, Message message);
}
