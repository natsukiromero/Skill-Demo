import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void testMadLibs() {
        assertEquals("cats are cool", SkillDemo.madLibs("cats", "cool"));
    }
}
