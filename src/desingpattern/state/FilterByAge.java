package desingpattern.state;

public class FilterByAge implements UserState {
    @Override
    public void filter(UserStateManager userStateManager, String filter) {
        userStateManager.filterUser(filter);
    }
}
