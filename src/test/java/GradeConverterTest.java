import org.junit.Before;
import org.junit.Test;

public class GradeConverterTest {
    private GradeConverter converter;

    @Before
    public void setUp() throws Exception {
        converter = new GradeConverter();
    }
    @Test

    public void testConvert1() {
        String excpected = "A";
        String actual = converter.convert( 100);
        assertEquals(excpected, actual);
    }

    private void assertEquals(String excpected, String actual) {
    }
    @Test
    public void testConvert2() {
        String excpected = "A";
        String actual = converter.convert(90);
        assertEquas(excpected, actual);
    }
    private void assertEquas(String excpected, String actual) {
    }
}