package desingpattern.mediator;

public class RemoteStudent extends Student {

    public RemoteStudent(ChatMediator chatMediator, String firstName) {
        super(chatMediator, firstName);
    }
    @Override
    public void send(String message) {
        System.out.println("Remote Student " + name + " sends: " + message);
        chatMediator.sendMessage(this, message);
    }
    @Override
    public void receive(String message) {
        System.out.println("All Remote Students receive: " + message);
    }
}
