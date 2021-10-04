/*
MultiThreading and Exception Handling ...
here we will understand the why do not call the run() method directly with object of Thread.

 */
class Thread3 extends Thread{
    public void run(){
        int c=100/0;
        // throw an exception "Arithmetic Exception " .
    }
}
public class MultiThreading3 {
    public static void main(String[] args) {
        Thread3 t1=new Thread3();
        Thread3 t2=new Thread3();
        // if we call t1.run() directly from exception we will get the Arithmetic Exception in main because t1 is
        // in the thread pool only main thread is in the thread pool.
        // t1.run();

        /*
        if we call it by t1.start()  t1 goes into thread pool and Arithmetic exception is now called by our thread-0

         */

        t1.start(); 
        t2.start();
    }
}
