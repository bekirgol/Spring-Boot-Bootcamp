package desingpattern.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatMediatorImpl implements ChatMediator {
    private List<Student> students;

    public ChatMediatorImpl() {
        students = new ArrayList<>();
    }

    @Override
    public void sendMessage(Student student, String message) {
        for (Student s : students) {
            if (s != student) {
                s.receive(message);
            }
        }
    }

    @Override
    public void addUser(Student student) {
        students.add(student);
    }
}
