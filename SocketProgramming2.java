/*
URL class: URL class in java used to access the resources of a world wide web.

Constructor :
      1.  new URL(url in string );
      2. new URL(protocol,string host,int port,string file)

 */
import  java.net.*;
public class SocketProgramming2 {
    public static void main(String[] args) throws MalformedURLException{
        URL url=new URL("https://github.com/Kailashmandal/Corejava_with_kailash.git");
        System.out.println("Host name : "+url.getHost());
        System.out.println("Port number : "+url.getPort());
        System.out.println("Protocol name : "+url.getProtocol());
        System.out.println("File name : "+url.getFile());
        System.out.println("Path is : "+url.getPath());
        System.out.println("Query is : "+url.getQuery());

    }
}
