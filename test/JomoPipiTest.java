import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class JomoPipiTest {
    @Test
    public void Basic1() {
        assertEquals("a0", JomoPipi.antiString("9Z"));
    }
    @Test
    public void Basic2() {
        assertEquals("aBc123", JomoPipi.antiString("678XyZ"));
    }
    @Test
    public void Basic3() {
        assertEquals("678bcdXYZ", JomoPipi.antiString("abcWXY123"));
    }
}