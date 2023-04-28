package desingpattern.mediator;

public interface ChatMediator {
    void sendMessage(Student student, String message);
    void addUser(Student student);
}
