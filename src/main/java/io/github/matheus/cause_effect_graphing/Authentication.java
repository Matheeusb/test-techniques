package io.github.matheus.cause_effect_graphing;

public class Authentication {

    /**
     * Authenticates a user based on the provided username and password.
     *
     * @param username the username to authenticate
     * @param password the password to authenticate
     * @return a message indicating the result of the authentication
     */
    public static String authenticate(String username, String password) {
        if (username.isEmpty() || password.isEmpty()) {
            return "Username and password must be provided";
        }

        if (username.equals("admin") && password.equals("admin")) {
            return "Authenticated";
        }

        return "Invalid username or password";
    }
}
