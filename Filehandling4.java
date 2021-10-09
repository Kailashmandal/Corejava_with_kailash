import java.io.FileInputStream;
import java.io.IOException;
/*
what if we try to read a book, from Fileinputstream class ?
 */
public class Filehandling4 {
    public static void main(String[] args) throws IOException {
        FileInputStream fin=new FileInputStream("C:\\Users\\admin\\Downloads\\KailashJavaBook.pdf"); //pass path of book

        int i;
        do{
            i=fin.read();
            if(i!=-1)
                System.out.print((char)i);
        }while (i!=-1);
        fin.close();

        System.out.println("Reading complete !! ");
    }
}
