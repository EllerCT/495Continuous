import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FoobarTest {

    @Test
    void testSuccess(){
        Foobar foo = new Foobar();
        Assertions.assertEquals(4, foo.doStuff(1));
    }

    @Test
    void testFailure(){
        Foobar foo = new Foobar();
        Assertions.assertNotEquals(4, foo.doStuff(2));
    }

    @Test
    void wrong(){
        Assertions.assertTrue(false);
    }
}
