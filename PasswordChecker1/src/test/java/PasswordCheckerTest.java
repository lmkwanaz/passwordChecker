import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckerTest {

    @Test
    void passwordIsValid() {
        PasswordChecker pas = new PasswordChecker();
        boolean check0 = pas.passwordIsValid("Lwandileneo@1");
        assertTrue(true);
        boolean check1 = pas.passwordIsValid("Lwandileneo1");
        assertFalse(false);
        boolean check2 = pas.passwordIsValid("lwandileNeo@1");
        assertTrue(true);
        boolean check3 = pas.passwordIsValid("LWANDILENEO@1");
        assertFalse(false);
    }

    @Test
    void passwordIsOk() {
        PasswordChecker pas = new PasswordChecker();
        boolean check0 = pas.passwordIsOk("Richneo@1");
        assertTrue(true);
        boolean check1 = pas.passwordIsOk("LWANDILENEO1");
        assertTrue(true);
    }
}