package desingpattern.state;

import java.util.List;

public class UserStateManager {
    private final List<User> userList;

    private UserState state;

    public UserStateManager(List<User> userList) {
        this.userList = userList;
        state = new NoFilterState();
    }

    public void showAllUser() {
        for (User user : userList) {
            System.out.println(user);
        }
    }

    public void setState(UserState state) {
        this.state = state;
    }

    public void filter(String filter) {
        state.filter(this, filter);
    }

    public void filterUser(String filter) {
        if (this.state instanceof FilterByName) {
            for (User user : userList) {
                if (user.getName().equals(filter)) {
                    System.out.println(user);
                }
            }
        } else if (state instanceof FilterByAge) {
            int age = Integer.parseInt(filter);

            for (User user : userList) {
                if (user.getAge() == age) {
                    System.out.println(user);
                }
            }
        } else {
            System.out.println("Bir hata oluştu");
        }
    }
}
