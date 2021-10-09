import java.io.FileOutputStream;
import java.io.IOException;

public class Filehandling2 {
    public static void main(String[] args)throws IOException {
        // this will create a Myfile.html file with .class file
        // and passing true means if try to add more information it will append into previous information.
        FileOutputStream fout=new FileOutputStream("./Myfile.html",true);

        String str="learning output stream in java ";
        char[] c=str.toCharArray(); // converting string into character array
        for (char i:c){
            fout.write(i);
        }
        fout.write(99);
        fout.close();
    }
}
