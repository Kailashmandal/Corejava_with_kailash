/*
Creating Threads using Runnable Interface :

         Runnable Interface have only one function:
                 void run() ;
     since it is an Interface we should have a class that implements the run method
 */
class Thread6 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running ...");
    }
}
class Thread7 implements Runnable{
    Thread7() {
        new Thread(this).start();
    }
    public void run() {
        System.out.println(Thread.currentThread().getName() + " " + "is running ...");
    }
}
public class MultiThreading7 {
    public static void main(String[] args) {
        /*if we directly run() our thread will not go into thread pool.
        so we have to use a constructor of class Thread that is
                                                  :-   Thread(RunnableInterface Object) ;

         */
        Thread6 t=new Thread6(); // it will act as object of Runnable interface
        Thread6 t1=new Thread6();

        Thread th=new Thread(t); // th is now can call start method
        Thread th1=new Thread(t1);

        // th is created by t (object of runnable interface) so t goes into the thread
        // th1 is created by t1 (object of Runnable Interface) so t1 goes into method
        th.start();
        th1.start();

        // by using this keyword in constructor of Thread()
        Thread7 th7=new Thread7();
    }
}
