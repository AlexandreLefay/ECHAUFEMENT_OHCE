import fr.epsi.c1.Main;
import org.junit.jupiter.api.Test;

public class MainTest {
    @Test
    public void testCheckPalindrome() {
        Main.checkPalindrome("radar", "radar");
        Main.checkPalindrome("test", "tset");
    }

    @Test
    public void testGreetUser() {
        Main.greetUser("radar", 10, "fr");
        Main.greetUser("test",  15, "en");
    }
}