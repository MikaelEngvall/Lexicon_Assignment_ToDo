package lexicon;

import lexicon.AppRole;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class AppUserTest {

    @ParameterizedTest
    @DisplayName("A username or password should not be equal to 'null' or empty, and role should not be equal to 'null'")
    @CsvSource(value = {
            "null, password, ROLE_APP_USER",
            ", password, ROLE_APP_USER",
            "username, null, ROLE_APP_USER",
            "username, , ROLE_APP_USER",
            "username, password, null",
    }, nullValues = {"null"})
    void appUserThrowsIfAnyFieldEqualToNullOrEmpty(String username, String password, AppRole role) {

        assertThrows(IllegalArgumentException.class,
                () -> new AppUser(username, password, role));
    }

    @ParameterizedTest
    @DisplayName("Two appUser objects with the same username and role should be equal")
    @CsvSource({
            "mikael, password, ROLE_APP_USER"
    })
    public void checkIfObjectsAreEqual(String username, String password, AppRole role) {
        AppUser appUser1 = new AppUser(username, password, role);
        AppUser appUser2 = new AppUser(username, password, role);

        assertEquals(appUser1, appUser2);
    }
    @Test
    @DisplayName("An AppUser object should not be equal to null")
    public void checkIfAppUserIsNotEqualToNull() {
        AppUser appUser2 = new AppUser("mikael", "password", AppRole.ROLE_APP_USER);

        assertNotEquals(null, appUser2);
    }
    @ParameterizedTest
    @DisplayName("The hashCode of two equal appUser objects should be equal")
    @CsvSource({
            "mikael, password, ROLE_APP_USER"
    })
    public void checkIfHashcodeIsEqual(String username, String password, AppRole role) {
        AppUser appUser1 = new AppUser(username, password, role);
        AppUser appUser2 = new AppUser(username, password, role);

        assertEquals(appUser1.hashCode(), appUser2.hashCode());
    }

    @Test
    @DisplayName("The string returned when toString() is invoked on AppUser object should be equal to the string provided in test")
    public void checkIfReturnedStringIsCorrect() {
        AppUser appUser = new AppUser("mikael", "password", AppRole.ROLE_APP_ADMIN);

        assertEquals("AppUser { username: mikael, role: ROLE_APP_ADMIN }", appUser.toString());
    }
}