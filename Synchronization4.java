/*
Synchronization  block example 2

 */
class Seneder {
    public void SenderMsg(String msg){

        System.out.println("sender message : "+msg);
    }
}
class Sender1 extends Thread{
    private String str;
    Seneder obj;
    public Sender1(String s,Seneder obj){
        this.obj=obj;
        str=s;
    }
    public void run(){
        obj.SenderMsg(str);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
class Sender2 extends Thread{
    private String str;
    Seneder obj;
    public Sender2(String s, Seneder obj){
        this.obj=obj;
        str=s;
    }
    public void run(){
        obj.SenderMsg(str);
        try {
            Thread.sleep(500);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
public class Synchronization4 {
    public static void main(String[] args) {
        Seneder send=new Seneder();
        Sender1 s1=new Sender1("Kailash",send);
        Sender2 s2=new Sender2("Mandal",send);

        s1.start();
        s2.start();
    }
}
