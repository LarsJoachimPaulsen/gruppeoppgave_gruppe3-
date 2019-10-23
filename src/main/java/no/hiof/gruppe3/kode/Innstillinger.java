package no.hiof.gruppe3.kode;

public class Innstillinger {

    public void endrePassord(LagNyBruker bruker, String passord, String nyttPassord, String bekreftNyttPassord){

        if(passord.equals(bruker.getPassord())){

            if (nyttPassord.equals(bekreftNyttPassord)){

                bruker.setPassord(nyttPassord);
            }
            else{
                System.out.println("passordene er ikke like");
            }

        }
        else{
            System.out.println("Passordet er feil");
        }

    }

}
