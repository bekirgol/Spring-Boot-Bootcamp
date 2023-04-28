package desingpattern.mediator;

public class OnSiteStudent extends Student {
    public OnSiteStudent(ChatMediator chatMediator, String firstName) {
        super(chatMediator, firstName);
    }

    @Override
    public void send(String message) {
        System.out.println("On-site Student " + name + " sends: " + message);
        chatMediator.sendMessage(this, message);
    }

    @Override
    public void receive(String message) {
        System.out.println("All On-site Students receive: " + message);
    }
}
