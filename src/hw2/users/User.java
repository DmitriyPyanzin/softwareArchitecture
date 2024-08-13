package hw2.users;

import hw2.mediator.Mediator;
import hw2.Message;

public abstract class User {

    protected Mediator mediator;

    public User(Mediator mediator) {
        this.mediator = mediator;
    }

    public void send(User user, Message message) {
        mediator.send(user, message);
    }

    public abstract void notify(Message message);
}

