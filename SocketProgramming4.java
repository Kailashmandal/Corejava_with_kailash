import java.net.InetAddress;

public class SocketProgramming4 {
    /*
    InetAddress class : represent the IP address of the host.It is present in java.net package.
     */
    public static void main(String[] args)throws Exception {
        InetAddress ip=InetAddress.getByName("google.com");

        /*
        getHostName : returns the name of the host
        getHostAddress: returns the name of the address
         */
        System.out.println("Host is : "+ip.getHostName());
        System.out.println("IP address is : "+ip.getHostAddress());
    }
}
