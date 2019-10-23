import no.hiof.gruppe3.model.LagNyBruker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LagNyBrukerTest {

    private LagNyBruker lagNyBruker = new LagNyBruker("","","",42,"","",false);

    @Test
    void sjekkerBrukerAlder() {
        assertEquals(42,lagNyBruker.getAlder());
    }

}