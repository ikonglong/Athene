import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class HelloTest {

    @Test
    public void testSayHello() throws Exception {
        Hello hello = new Hello();
        Assert.assertEquals("Hello world", hello.sayHello());
    }
}