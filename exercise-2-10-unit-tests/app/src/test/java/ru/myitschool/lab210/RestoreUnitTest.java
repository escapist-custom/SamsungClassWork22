package ru.myitschool.lab210;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.testng.annotations.Test;
import junit.framework.TestCase;

import java.util.Arrays;

public class RestoreUnitTest extends TestCase{
    int ar[] = {2, 3, 4, 55};
    int ar2[] = {2, 5, 2, 1};
    int ar3[] = {2, 3, 4, 55};
    private String st1 = "Java";
    private String st2 = "Python";
    int age1 = 15;
    int age2 = 25;

    @Test
    public void testOne() {
        assertEquals(ar, ar2);
    }

    @Test
    public void testTwo() {
        assert ar.equals(ar2);
    }

    @Test
    public void testThree() {}

    @Test
    public void testFour() {}

    @Test
    public void testFive() {}
    @Test
    public void testSix() {}
}
