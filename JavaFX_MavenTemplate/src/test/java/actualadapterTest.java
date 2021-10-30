import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class actualadapterTest {
    private forUS client1;
    private forUS client2;
    private forUS client3;
    private forUS client4;

    private actualadapter ukclient1;
    private actualadapter ukclient2;
    private actualadapter ukclient3;
    private actualadapter ukclient4;

    @BeforeEach
    void setUp () {
        client1 = new models();
        ukclient1 = new actualadapter(client1);

        client2 = new model3();
        ukclient2 = new actualadapter(client2);

        client3 = new modelx();
        ukclient3 = new actualadapter(client3);

        client4 = new modely();
        ukclient4 = new actualadapter(client4);

    }

    @Test
    void getSpeed () {
        assertEquals(322.0, ukclient1.getSpeed(), "wrong speed conversion of mph to kmh");
        assertEquals(261.0, ukclient2.getSpeed(), "wrong speed conversion of mph to kmh");
    }

    @Test
    void getRange () {
        assertEquals(507.0,ukclient2.getRange(), "wrong conversion");
        assertEquals(547.0, ukclient3.getRange(), "wrong conversion");
    }

    @Test
    void get0to60 () {
        assertEquals(2.5, ukclient3.get0to60(), "wrong secs");
        assertEquals(3.5, ukclient4.get0to60(), "wrong secs");

    }

    @Test
    void getprice () {
        assertEquals(45253.0, ukclient4.getprice(), "wrong conversion of dollars to pounds");
        assertEquals(94893.0, ukclient1.getprice(), "wrong conversion of dollars to pounds");
    }
}