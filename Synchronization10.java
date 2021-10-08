/*
interrupt() : is method used to interrupt the working of sleep() or wait() method
isInterrupted() : return true or false as thread is interrupted or not .
 */
class Interrupts extends Thread{
    public void run(){

        for (int i=1;i<3;i++){
            try {
                Thread.sleep(1500);
            }catch (Exception e){
                System.out.println(i+" Exception handled !!"+Thread.currentThread().getName()+"\n"+e);
            }
            if(Thread.currentThread().isInterrupted()){
                System.out.println(i+ " Interrupted code ! "+Thread.currentThread().getName());
            }else {
                System.out.println(i+" normal code ! "+Thread.currentThread().getName());
            }
        }
    }
}
public class Synchronization10 {
    public static void main(String[] args)throws InterruptedException {
        Interrupts t1=new Interrupts();
        Interrupts t2=new Interrupts();

        t1.start();
        t1.interrupt();
        System.out.println(t1.isInterrupted());
        t2.start();

    }
}
