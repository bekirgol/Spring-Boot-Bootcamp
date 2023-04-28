package desingpattern.state;

import java.util.Arrays;
import java.util.List;

public class StateTest {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(new User("Bekir", 24), new User("Ahmet", 22));
        UserStateManager userStateManager = new UserStateManager(users);
        userStateManager.setState(new FilterByAge());
        userStateManager.filter("24");


    }
}
