package desingpattern.state;

public class NoFilterState implements UserState {
    @Override
    public void filter(UserStateManager userStateManager, String filter) {
        userStateManager.showAllUser();
    }
}
