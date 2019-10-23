import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;

public abstract class SkrivTilServer {

    public void lesFraServer(){
        String filsti = "CVC/billettinformasjon.cvc";
        String line = "";
        String cvsSplitBy = ",";


        try{
            BufferedReader lesFraFil = new BufferedReader(new FileReader(String filsti)){

                while((line = lesFraFil.readLine() != null))

            }
        }
        catch(FileNotFoundException FNFE){
            FNFE.printStackTrace();
        }


    }

}
