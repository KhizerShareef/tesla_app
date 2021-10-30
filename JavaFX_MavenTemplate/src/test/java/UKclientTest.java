import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UKclientTest {
    private UKclient client2;
    @BeforeEach
    void setUp () {
        client2 = new UKclient();
    }

    @Test
    void modelSinfo () {
        String s = "MODEL S\nTop Speed (kmh): 322.0\nRange (kmh): 637.0\n0 to 60 (sec): 1.99\nPrice: £94893.0";
        assertEquals(s, client2.modelSinfo(), "wrong output");

    }

    @Test
    void model3info () {
        String s = "MODEL 3\nTop Speed (kmh): 261.0\nRange (kmh): 507.0\n0 to 60 (sec): 3.1\nPrice: £42333.0";
        assertEquals(s, client2.model3info(), "wrong output");
    }

    @Test
    void modelXinfo () {
        String s = "MODEL X\nTop Speed (kmh): 262.0\nRange (kmh): 547.0\n0 to 60 (sec): 2.5\nPrice: £87593.0";
        assertEquals(s, client2.modelXinfo(), "wrong output");
    }

    @Test
    void modelYinfo () {
        String s = "MODEL Y\nTop Speed (kmh): 249.0\nRange (kmh): 488.0\n0 to 60 (sec): 3.5\nPrice: £45253.0";
        assertEquals(s, client2.modelYinfo(), "wrong output");
    }
}