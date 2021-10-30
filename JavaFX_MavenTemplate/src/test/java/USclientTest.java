import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class USclientTest {
    private USclient client1;
    @BeforeEach
    void setUp () {
        client1 = new USclient();
    }

    @Test
    @DisplayName("Model S info")
    void modelSinfo () {
        String s = "MODEL S\nTop Speed (mph): 200.0\nRange (mph): 396.0\n0 to 60 (sec): 1.99\nPrice: $129990.0";
        assertEquals( s, client1.modelSinfo(), "wrong output" );
    }

    @Test
    void model3info () {
        String s = "MODEL 3\nTop Speed (mph): 162.0\nRange (mph): 315.0\n0 to 60 (sec): 3.1\nPrice: $57990.0";
        assertEquals( s,client1.model3info(), "wrong output" );
    }

    @Test
    void modelXinfo () {
        String s = "MODEL X\nTop Speed (mph): 163.0\nRange (mph): 340.0\n0 to 60 (sec): 2.5\nPrice: $119990.0";
        assertEquals(s,client1.modelXinfo(),"wrong output");
    }

    @Test
    void modelYinfo () {
        String s = "MODEL Y\nTop Speed (mph): 155.0\nRange (mph): 303.0\n0 to 60 (sec): 3.5\nPrice: $61990.0";
        assertEquals(s, client1.modelYinfo(), "wrong output");
    }
}