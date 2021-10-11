import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Filehandling7 {
    public static void main(String[] args) throws IOException {
        FileReader fr=new FileReader("./Myfile.html");
        BufferedReader buf=new BufferedReader(fr);

        String  ch;

        // readLine() method : returns the string collected in the buffer of characters

        while ((ch=buf.readLine())!=null){

            System.out.println(ch+" ");

        }
        fr.close();
        buf.close();

        System.out.println("Reading Completed !! ");
    }
}
