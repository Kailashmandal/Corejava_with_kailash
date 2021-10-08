/*

 */
class ShareData{
    public int data;
    private boolean isNotData=true;

    public void Produce(int x){
        if(!isNotData){
            try {
                wait();
            }
            catch (Exception e){
                System.out.println(e);
            }
            return;
        }
        data=x;
        System.out.println("produced data"+x);
        isNotData=false;
        notify();
    }
    public int Consume(){
        if(isNotData){
            try{
                wait();
            }catch (Exception e){
                System.out.println(e);
            }
            return -1;
        }
        isNotData=true;
        notify();
        return data;
    }

}
class Consumer extends Thread{
    ShareData d;
    public Consumer(ShareData d){
        this.d=d;
    }
    public void run(){
        for (int i=1;i<6;i++)
        System.out.println("Consuming data : "+d.Consume());
    }
}
class Producer extends Thread{
    ShareData d;
    public Producer(ShareData d){
        this.d=d;
    }
    public void run(){
        for (int i=1;i<6;i++)
        d.Produce(5);
    }
}
public class Synchronization5 {
    public static void main(String[] args) {
        ShareData sd=new ShareData();

        Consumer c=new Consumer(sd);
        Producer p=new Producer(sd);

        c.start();
        p.start();
    }
}
