package test.java;

import main.java.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by jdoyle on 07/12/2016.
 */
public class HelloWorldTest {
    @Test
    public void message() throws Exception {
        assertEquals("hello world", HelloWorld.message());
    }

}