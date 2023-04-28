package desingpattern.state;

public class FilterByName implements UserState {
    @Override
    public void filter(UserStateManager userStateManager, String filter) {
        userStateManager.filterUser(filter);
    }
}
