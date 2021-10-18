import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class SocketProgramming6 {
    public static void main(String[] args) throws Exception {
        DatagramSocket ds=new DatagramSocket();
        String str="Sending data by Datagram packets";
        byte[] b=str.getBytes();
        InetAddress ip=InetAddress.getByName("localhost");
        DatagramPacket dp=new DatagramPacket(b,b.length,ip,999);

        ds.send(dp);
        System.out.println("message sent!!");
        ds.close();
    }
}
