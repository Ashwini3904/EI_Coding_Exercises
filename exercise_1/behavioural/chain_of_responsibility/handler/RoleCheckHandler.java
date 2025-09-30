package handler;

public class RoleCheckHandler extends Handler {

    @Override
    public boolean handle(String username, String password) {
        if ("admin_username".equals(username)) {
            System.out.println("Welcome Admin! Loading Admin Dashboard...");
            return true;
        }
        System.out.println("Welcome User! Loading User Dashboard...");
        return handleNext(username, password);
    }
}
