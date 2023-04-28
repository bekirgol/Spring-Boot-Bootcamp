package desingpattern.state;

public interface UserState {
    void filter(UserStateManager userStateManager, String filter);
}
