import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//dfhsh
class BestillingTest {

    Bestilling bestilling = new Bestilling();

    @Test
    void bestillingRedusererTilgjengligeBilleterTest(){

        assertEquals("Det finnes desverre ikke nok billetter", bestilling.bestillBillet(103));
        assertEquals("Bestilling vellykket", bestilling.bestillBillet(100));
        assertEquals("Det er desverre tomt for billetter", bestilling.bestillBillet(2));

    }

}