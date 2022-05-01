import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void testMadLibs() {
        assertEquals("catsarecool", SkillDemo.madLibs("cats", "cool"));
    }
}
