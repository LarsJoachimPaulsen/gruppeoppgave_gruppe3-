public class Bestilling {

    private long kortnr;
    private short cvc;
    private int antallBilletter = 100;


    /* her bør vi senere også sende med noe som bruker? sende dette videre til en ekstern betalingsside, som returnerer
    en boolean (True for godkjent, False for ikke godkjent), bruker returverdien her til å sende billetter på mail/sms.
    At kort blir avvist vil vises hos tredjepart.
     */
    public String bestillBillet(int velgAntallBilleter) {



        if(antallBilletter > 0){



            if(velgAntallBilleter > antallBilletter){
                return "Det finnes desverre ikke nok billetter";

            }
            else{
                antallBilletter -= velgAntallBilleter;
                // sende til betalingsside, returnerer godkjent ikke godkjent
                         // Send bekreftelse(bruker) <-- sender mail med billett/ evt sms.

                return "Bestilling vellykket";
            }
        }
        else{
            return "Det er desverre tomt for billetter";
        }


    }
}
