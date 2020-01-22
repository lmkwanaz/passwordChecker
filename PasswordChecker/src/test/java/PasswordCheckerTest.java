import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.function.Executable;

class PasswordCheckerTest {

    PasswordChecker all = new PasswordChecker();

    @Test
    void passwordIsValid() throws  Exception{
        PasswordChecker pas = new PasswordChecker();
        boolean check0 = pas.
                passwordIsValid("Lwandileneo@1");
        assertTrue(true);
        boolean check1 = pas.passwordIsValid("Lwandileneo1");
        assertFalse(false);
        boolean check2 = pas.passwordIsValid("lwandileNeo@1");
        assertTrue(true);
        boolean check3 = pas.passwordIsValid("LWANDILENEO@1");
        assertFalse(false);
            Throwable exception = assertThrows(
                    Exception.class, () -> {
                        PasswordChecker user = new PasswordChecker();
                        user.passwordIsValid("");
                    }
            );

        assertEquals("this field can't be empty!", exception.getMessage());

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