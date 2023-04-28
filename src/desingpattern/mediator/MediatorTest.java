package desingpattern.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        ChatMediator chatMediator = new ChatMediatorImpl();
        Student onSiteStudentA = new OnSiteStudent(chatMediator, "A");
        Student remoteStudentA = new RemoteStudent(chatMediator, "A");
        Student onSiteStudentB = new OnSiteStudent(chatMediator, "B");

        chatMediator.addUser(onSiteStudentA);
        chatMediator.addUser(remoteStudentA);
        chatMediator.addUser(onSiteStudentB);

        onSiteStudentA.send("Hi remote, how is going?");
        remoteStudentA.send("Hi, great. I have lots of things to do, how about you?");
        onSiteStudentB.send("It similar :(");

    }
}
