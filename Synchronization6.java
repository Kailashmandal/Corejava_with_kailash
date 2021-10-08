import java.awt.print.Printable;

/*
Static synchronization : is used when we have more two threads, and we have to synchronize them .
by making synchronized method or block static .
 */
class TablePrint {
    static synchronized void PrintTable(int n){
        for (int i=1;i<11;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(400);
            }catch (Exception e){
                System.out.println();
            }
        }
    }
}
class Threads1 extends Thread{
    public void run(){
        TablePrint.PrintTable(3);
    }
}
class Threads2 extends Thread{
    public void run(){
        TablePrint.PrintTable(4);
    }
}
class Threads3 extends Thread{
    public void run(){
        TablePrint.PrintTable(5);
    }
}
class Threads4 extends Thread{
    public void run(){
        TablePrint.PrintTable(6);
    }
}
public class Synchronization6 {
    public static void main(String[] args) {
         Threads1 t1=new Threads1();
         Threads2 t2=new Threads2();
         Threads3 t3=new Threads3();
         Threads4 t4=new Threads4();

         t1.start();
         t2.start();
         t3.start();
         t4.start();
    }
}
