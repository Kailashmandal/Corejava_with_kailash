import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
BufferedInputStream class : is used to read the data from the file in buffer from.
 */
public class Filehandling10 {
    public static void main(String[] args) throws IOException {
        FileInputStream fi=new FileInputStream("./Myfile.html");
        BufferedInputStream bufi=new BufferedInputStream(fi);

        int i;
        i= bufi.read(); // read() returns data in ASCII code

        while (i!= -1){
            System.out.print((char) i+" ");
              i=bufi.read();
        }
        bufi.close();
        fi.close();
    }
}
