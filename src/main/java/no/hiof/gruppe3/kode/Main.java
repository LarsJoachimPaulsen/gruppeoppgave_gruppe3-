package no.hiof.gruppe3.kode;

//test
public class Main {
    public static void main(String[] args){
        System.out.println("Funker");

        LagNyBruker bruker1 = new LagNyBruker("paulsen", "Lars", "abc@gmail.com", 27, "LP", "abc123", false);

        System.out.println(bruker1.getBrukernavn() + " " + bruker1.getEtternavn());

        Innstillinger innstillingerForBruker = new Innstillinger();

        System.out.println(bruker1.getEpost());

        innstillingerForBruker.endreEpost(bruker1, "abc123", "123@gmail.com", "123@gmail.com");

        System.out.println(bruker1.getEpost());

        System.out.println(bruker1.getPassord());

        innstillingerForBruker.endrePassord(bruker1, "abc123","123Abc", "123Abc");

        System.out.println(bruker1.getPassord());

    }
}
