package io.github.vedantwankhade;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class AppTest {
    @Test
    public void testApp() {
        assertEquals("Project setup properly", "Hello, World!", App.setup());
    }
}
