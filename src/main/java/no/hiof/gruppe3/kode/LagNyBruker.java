package no.hiof.gruppe3.kode;

public class LagNyBruker extends Bruker {

    private Bruker bruker;
    private String brukernavn, passord;
    private Boolean brukerErKlubb;


    public LagNyBruker(
            String fornavn, String etternavn, String epost, int alder,
            Bruker bruker, String brukernavn, String passord,  Boolean brukerErKlubb

    ){
        super(fornavn, etternavn, epost ,alder );
        this.bruker = bruker;
        this.brukerErKlubb = brukerErKlubb;
        this.brukernavn = brukernavn;
        this.passord = passord;


    }

    //public LagNyBruker(){}


    public void LeggTilNyBruker(Bruker bruker, String brukernavn, String passord, String epost, Boolean brukerErKlubb){

    }


    public String getBrukernavn(){
        return brukernavn;
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


    public void setBruker(Bruker bruker){
        this.bruker = bruker;
    }

    public void setBrukerErKlubb(Boolean brukerErKlubb){
        this.brukerErKlubb = brukerErKlubb;
    }


}
