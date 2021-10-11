import java.io.File;
/*
File class in java .
 */

public class Filehandling8 {
    public static void main(String[] args) throws Exception{
        File fi=new File("./Myfile1.html");
      //  fi.delete(); // delete() is used to delete the file if exist
        System.out.println(fi.exists());

        fi.createNewFile();// used to create the file
        System.out.println("is file exist : "+fi.exists());

        System.out.println("Can read "+fi.canRead());
        System.out.println("Can write "+fi.canWrite());
        System.out.println("File name : "+fi.getName());
        System.out.println("lenght is : "+fi.length()); // give numbers of characters in file
       // fi.deleteOnExit(); is used to delete the file created on exit.
    }
}
