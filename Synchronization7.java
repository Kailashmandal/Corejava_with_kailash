// static synchronization using anonymous classes
class CommaPrint{
    synchronized static void PrintCommas(int n){
        for(int i=1;i<n+1;i++){
            System.out.print(", ");
        }
        System.out.println();
    }
}
public class Synchronization7 {
    public static void main(String[] args) {
        Thread t1=new Thread(){
          public void run(){
              CommaPrint.PrintCommas(5);
          }
        };

        Thread t2= new Thread(() -> CommaPrint.PrintCommas(6));

        Thread t3=new Thread(){
          public void run(){
              CommaPrint.PrintCommas(7);
          }
        };

        Thread t4=new Thread(){
            public void run(){
                CommaPrint.PrintCommas(8);
            }
        };

        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
