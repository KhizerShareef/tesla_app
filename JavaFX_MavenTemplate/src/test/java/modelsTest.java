import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// all the other model3,modelx,modely tests are similar to this test and seemed redundant to add but I tested them on my end :)
class modelsTest {
    private models s1;

    @BeforeEach
    void setup () {
        s1 = new models();
    }

    @Test
    void nametest () {
        assertEquals("MODEL S", s1.getName(), "wrong name");
    }

    @Test
    void speedtest () {
        assertEquals(200, s1.getSpeed(), "wrong speed");
    }

    @Test
    void  rangetest() {
        assertEquals(396, s1.getRange(), "wrong range");
    }

    @Test
    void zerotosixty() {
        assertEquals(1.99, s1.get0to60(), "wrong 0 to 60 mph");
    }

    @Test
    void  priceTest() {
        assertEquals(129990, s1.getprice(), "wrong price in $");
    }
}