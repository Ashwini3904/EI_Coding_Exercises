package client;
import handler.Handler;

public class AuthService {
    private final Handler handler;

    public AuthService(Handler handler) {
        this.handler = handler;
    }

    public boolean logIn(String username, String password) {
        if (handler.handle(username, password)) {
            System.out.println("Authorization successful!");
            return true;
        }
        System.out.println("Authorization failed!");
        return false;
    }
}

