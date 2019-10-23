import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BestillingTest {

    Bestilling bestilling = new Bestilling();

    @Test
    void bestillingRedusererTilgjengligeBilleterTest(){

        assertEquals(1, bestilling.bestillBillet(2) );

    }

}