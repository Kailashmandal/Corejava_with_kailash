import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client1 {
    public static void main(String[] args) throws IOException {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the message : ");
        String str= sc.nextLine();

        Socket s=new Socket("localhost"/*provide host ip address*/,99/*provide port number of server*/);
        System.out.println(s);

        /*
        Sending messages by client  .
         */
        OutputStream os=s.getOutputStream();
        InputStream is=s.getInputStream();
        DataOutputStream dos=new DataOutputStream(os);
        DataInputStream din=new DataInputStream(is);
        dos.writeUTF(str);
        System.out.println("message sent !!");
        String str1=din.readUTF();
        System.out.println(str1+" -by server");

        dos.close();
        din.close();
        }
    }

