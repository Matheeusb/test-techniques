package io.github.matheus.cause_effect_graphing;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Cause-Effect Graphing
 * <p>
 * C1: username is provided
 * C2: password is provided
 * C3: username is 'admin'
 * C4: password is 'admin'
 * E1: authenticated user
 * E2: error message: username and password must be provided
 * E3: error message: invalid username or password
 * <p>
 * C1 AND C2 AND C3 AND C4 -> E1
 * C1 OR C2 -> E2
 * C3 OR C4 -> E3
 * <p>
 * | C1 | C2 | C3 | C4 | E1 | E2 | E3 |
 * |----|----|----|----|----|----|----|
 * | 1  | 1  | 1  | 1  | 1  | 0  | 0  |
 * | 1  | 1  | 1  | 0  | 0  | 0  | 1  |
 * | 1  | 1  | 0  | 1  | 0  | 0  | 1  |
 * | 1  | 1  | 0  | 0  | 0  | 0  | 1  |
 * | 1  | 0  | 1  | 0  | 0  | 1  | 0  |
 * | 1  | 0  | 0  | 0  | 0  | 1  | 0  |
 * | 0  | 1  | 0  | 1  | 0  | 1  | 0  |
 * | 0  | 1  | 0  | 0  | 0  | 1  | 0  |
 * | 0  | 0  | 0  | 0  | 0  | 1  | 0  |
 */
class AuthenticationTest {

    @Test
    @DisplayName("Should return 'Authenticated' when username and password are 'admin'")
    void testAuthenticateAdmin() {
        assertEquals("Authenticated", Authentication.authenticate("admin", "admin"));
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username is 'admin' and password is not 'admin'")
    void testAuthenticateInvalidPassword() {
        assertEquals("Invalid username or password", Authentication.authenticate("admin", "user"));
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username is not 'admin' and password is 'admin'")
    void testAuthenticateInvalidUsername() {
        assertEquals("Invalid username or password", Authentication.authenticate("user", "admin"));
    }

    @Test
    @DisplayName("Should return 'Invalid username or password' when username and password are not 'admin'")
    void testAuthenticateInvalid() {
        assertEquals("Invalid username or password", Authentication.authenticate("user", "user"));
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when password is empty")
    void testAuthenticatePasswordEmpty() {
        assertEquals("Username and password must be provided", Authentication.authenticate("admin", ""));
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when password is empty and username is invalid")
    void testAuthenticatePasswordEmptyUsernameInvalid() {
        assertEquals("Username and password must be provided", Authentication.authenticate("user", ""));
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty")
    void testAuthenticateUsernameEmpty() {
        assertEquals("Username and password must be provided", Authentication.authenticate("", "admin"));
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty and password invalid")
    void testAuthenticateUsernameEmptyPasswordInvalid() {
        assertEquals("Username and password must be provided", Authentication.authenticate("", "user"));
    }

    @Test
    @DisplayName("Should return 'Username and password must be provided' when username is empty and password is empty")
    void testAuthenticateUsernamePasswordEmpty() {
        assertEquals("Username and password must be provided", Authentication.authenticate("", ""));
    }
}
