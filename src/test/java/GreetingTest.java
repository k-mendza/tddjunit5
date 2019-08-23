import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    void testHelloWorld() {
        Greeting greeting = new Greeting();
        assertEquals("Hello World", greeting.helloWorld());
    }

    @Test
    void testHelloWorldWithName() {
        Greeting greeting = new Greeting();
        String name = "Charles";
        assertEquals("Hello Charles", greeting.helloWorld(name));
    }
}
