import java.net.*;
public class SocketProgramming5 {
    /*
    socket programming using DatagramPacket and DatagramSocket
     */
    public static void main(String[] args) throws Exception{
       DatagramSocket ds=new DatagramSocket(999);
       byte[] b=new byte[1024];
       DatagramPacket dp=new DatagramPacket(b,b.length);
       ds.receive(dp);
       String str=new String(dp.getData(),0,dp.getLength());
        System.out.println("received data is : "+str);

        ds.close();
    }
}
