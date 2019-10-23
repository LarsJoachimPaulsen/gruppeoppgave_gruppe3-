package no.hiof.gruppe3.Kode;

public class LagNyBruker extends Bruker {

    private Bruker bruker;
    private String brukernavn, passord, epost;
    private Boolean brukerErKlubb;


    public LagNyBruker(
            String fornavn, String etternavn, int alder,
            Bruker bruker, String brukernavn, String passord, String epost, Boolean brukerErKlubb

    ){
        super(fornavn, etternavn, alder);
        this.bruker = bruker;
        this.brukerErKlubb = brukerErKlubb;
        this.brukernavn = brukernavn;
        this.passord = passord;
        this.epost = epost;

    }

    //public LagNyBruker(){}


    public void LeggTilNyBruker(Bruker bruker, String brukernavn, String passord, String epost, Boolean brukerErKlubb){

    }


    public String getBrukernavn(){
        return brukernavn;
    }

    public String getEpost(){
        return epost;
    }


    public Bruker getBruker(){
        return bruker;
    }

    public Boolean getBrukerErKlubb(){
        return brukerErKlubb;
    }

    public void setBrukerNavn(String brukernavn){
        this.brukernavn = brukernavn;
    }

    public void setPassord(String passord){
        this.passord = passord;
    }

    public void setEpost(String epost){

        if (epost.contains("@")){
            this.epost = epost;

        }
        else{
            System.out.println("Ugyldig epost");
        }

    }

    public void setBruker(Bruker bruker){
        this.bruker = bruker;
    }

    public void setBrukerErKlubb(Boolean brukerErKlubb){
        this.brukerErKlubb = brukerErKlubb;
    }


}
