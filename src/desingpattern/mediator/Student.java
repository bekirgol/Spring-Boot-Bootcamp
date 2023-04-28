package desingpattern.mediator;

public abstract class Student {
    protected ChatMediator chatMediator;
    protected String name;

    public Student(ChatMediator chatMediator, String name) {
        this.chatMediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);

    public abstract void receive(String message);
}
