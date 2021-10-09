import java.io.FileInputStream;
import java.io.IOException;

/*
FileInputStream in java is extended class of inputStream.
 */
public class Filehandling3 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin=new FileInputStream("./Myfile.html");// passing the path by ./ of current folder and
                                                                       // file name : Myfile.html
        int ch;
        do {
            ch=fin.read();
            if(ch!=-1)
                System.out.print((char) ch+" ");
        }while (ch!=-1);

        fin.close();
    }
}
