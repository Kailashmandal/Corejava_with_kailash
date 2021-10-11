import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
BufferedOutputStream class : is used to write the data in buffered form of bytes stream.

methods: write(int b) and write(byte[] b, int start_pos , int size)

 */
public class Filehandling9 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fo=new FileOutputStream("./Myfile.html",true);
        BufferedOutputStream buf=new BufferedOutputStream(fo);

        String str="Learning file handling .";
        byte[] b=str.getBytes();
        buf.write(b);

        buf.close();
        fo.close();

        System.out.println("File written !!");
    }
}
