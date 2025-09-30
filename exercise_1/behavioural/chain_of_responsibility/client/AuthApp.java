package client;

import data.Database;
import handler.*;

public class AuthApp {
    public static void main(String[] args) {
        Database database = new Database();

        Handler handler = new UserExistsHandler(database);
        handler.setNextHandler(new ValidPasswordHandler(database))
               .setNextHandler(new RoleCheckHandler());

        AuthService authService = new AuthService(handler);

        System.out.println("Auth Workflow Demo ");

        authService.logIn("unknown_user", "12345");
        System.out.println("--------------------------------------");

        authService.logIn("user_username", "wrong_pass");
        System.out.println("---------------------------------------");

        authService.logIn("user_username", "user_password");
        System.out.println("----------------------------------------");

        authService.logIn("admin_username", "admin_password");
        System.out.println("----------------------------------------");
    }
}

