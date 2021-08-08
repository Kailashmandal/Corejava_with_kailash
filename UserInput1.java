import java.io.BufferedReader;   // import BufferedReader class
import java.io.InputStreamReader; // InputStreamReader
import java.io.IOException;       // IOException for InputStreamReader
public class UserInput1 {
    public static void main(String[] args)throws IOException {
       BufferedReader input=new BufferedReader(new InputStreamReader(System.in));
       /* 1. input is an object of class BufferedReader and also acting as wapper class 
       for InputStreanReader .

       2. 'System.in'  is used for taking input from system or keyboard .

       3. 'new'  is keyword used for making a new object of class.
       */
      System.out.print("Enter a string : ");
       String name=input.readLine();
        /* 1. readLine is method present in BefferedReader class.

          2.  ' . '(dot) is operator used by objects to call methods */

       System.out.print("Enter a Character : ");
       char ch=input.readLine().trim().charAt(0);
       /* 1. trim() is used for triming the extra space before the actual string in Buffer.

       2.  charAt(index) is a string method used for accessing the character at that index.
       */
       System.out.println("Name is : "+name);
       System.out.println("Character is : "+ch);
    }
}
