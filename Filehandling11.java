import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

/*
SequenceInputStream: is used to read data from the multiple streams.

constructor :
         SequenceInputStream(InputStream s1,InputStream s2);

 */
public class Filehandling11 {
    public static void main(String[] args) throws IOException {
        // creating two file input streams.
        FileInputStream f1=new FileInputStream("./Myfile.html");
        FileInputStream f2=new FileInputStream("./Myfile1.html");
        BufferedInputStream buf1=new BufferedInputStream(f1);
        BufferedInputStream buf2=new BufferedInputStream(f2);

        SequenceInputStream Read_f1_f2 =new SequenceInputStream(buf1,buf2);// you can also use f1,f2 also output will be same

        int i =Read_f1_f2.read();
        while (i!= -1){
            System.out.print((char) i+" ");

            i=Read_f1_f2.read();
        }
        // closing the streams
        Read_f1_f2.close();
        f1.close();
        f2.close();

        System.out.println("Successfully read two streams !! ");
    }
}
