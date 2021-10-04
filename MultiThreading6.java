/*
join() method : it is used when you want one thread to wait for execution of other thread.

internal implementation is :
          public final void join() throws Interrupted Exception
                        OR
          public final void join(long milliseconds) throws Interrupted Exception


 InterruptedException : is thrown when one thread interrupts the execution of any other thread.

 syntax : we have to use an object of thread to call it since it is non-static method
 */
class  Thread5 extends Thread{
    public void run(){
        for(int i=0;i<6;i++) {
            // for thread-0
            System.out.println(i+" "+Thread.currentThread().getName());
        }
    }
}
public class MultiThreading6 {
    public static void main(String[] args)throws InterruptedException {
        Thread5 th=new Thread5();
        th.start();

        // we have now two threads in thread pool 1st is main 2nd is thread-0
        th.join();// main thread is executing this so main thread get blocked util execution of thread-0 is completed
        for(int i=0;i<6;i++) {
            System.out.println(i+" "+Thread.currentThread().getName()); // for main thread
        }

    }

}
