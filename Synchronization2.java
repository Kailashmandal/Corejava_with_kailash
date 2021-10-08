/*
Synchronization using Anonymous classes :
 */
class Mythreadx {
    synchronized void PrintTable(int n){
        for (int i=1;i<11;i++){
            System.out.println(i*n);
            try{
                Thread.sleep(500);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
}
public class Synchronization2 {
    public static void main(String[] args) {
        Mythreadx obj=new Mythreadx();

        Thread t1=new Thread(){  // creating anonymous class 1

            // implementing run() method
            public void run(){
                obj.PrintTable(5);
            }
        };

        Thread t2=new Thread(){    // creating anonymous class

            // implementing run() method
          public void run(){
              obj.PrintTable(7);
          }
        };

        t1.start(); // starting the threads
        t2.start();
    }
}
