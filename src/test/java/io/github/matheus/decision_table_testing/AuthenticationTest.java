package io.github.matheus.decision_table_testing;

import io.github.matheus.cause_effect_graphing.Authentication;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * Decision Table Testing
 * <p>
 * Condition         | Rule 1  | Rule 2  | Rule 3  | Rule 4  | Rule 5  | Rule 6  | Rule 7  | Rule 8  | Rule 9  |
 * ------------------|---------|---------|---------|---------|---------|---------|---------|---------|---------|
 * Username filled   |    0    |    1    |    1    |    0    |    0    |    1    |    1    |    1    |    1    |
 * Password filled   |    0    |    0    |    0    |    1    |    1    |    1    |    1    |    1    |    1    |
 * Username is valid |    0    |    0    |    1    |    0    |    0    |    0    |    0    |    1    |    1    |
 * Password is valid |    0    |    0    |    0    |    0    |    1    |    0    |    1    |    0    |    1    |
 * ------------------|---------|---------|---------|---------|---------|---------|---------|---------|---------|
 * Result            |  Error  |  Error  |  Error  |  Error  |  Error  |  Error  |  Error  |  Error  |   Auth  |
 */
class AuthenticationTest {

    @Test
    @DisplayName("Should return 'Authenticated' when username and password are 'admin'")
    void testAuthenticateAdmin() {
        assertEquals(Authentication.authenticate("admin", "admin"), "Authenticated");
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username is 'admin' and password is not 'admin'")
    void testAuthenticateInvalidPassword() {
        assertEquals(Authentication.authenticate("admin", "user"), "Invalid username or password");
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username is not 'admin' and password is 'admin'")
    void testAuthenticateInvalidUsername() {
        assertEquals(Authentication.authenticate("user", "admin"), "Invalid username or password");
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username and password are not 'admin'")
    void testAuthenticateInvalid() {
        assertEquals(Authentication.authenticate("user", "user"), "Invalid username or password");
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when password is empty")
    void testAuthenticatePasswordEmpty() {
        assertEquals(Authentication.authenticate("admin", ""), "Username and password must be provided");
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when password is empty and username is invalid")
    void testAuthenticatePasswordEmptyUsernameInvalid() {
        assertEquals(Authentication.authenticate("user", ""), "Username and password must be provided");
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty")
    void testAuthenticateUsernameEmpty() {
        assertEquals(Authentication.authenticate("", "admin"), "Username and password must be provided");
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty and password invalid")
    void testAuthenticateUsernameEmptyPasswordInvalid() {
        assertEquals(Authentication.authenticate("", "user"), "Username and password must be provided");
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty and password is empty")
    void testAuthenticateUsernamePasswordEmpty() {
        assertEquals(Authentication.authenticate("", ""), "Username and password must be provided");
    }
}
