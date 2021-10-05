/*
Daemon Thread : The thread which provide the service to other threads is called
                daemon threads , it executes in the background of the other threads.
                e.g : GarbageCollector , finalizer Attach listener , signal dispatchers etc.


                functions :
                1. public final void setDaemon(boolean value) : used to set a thread daemon thread

                2. public final boolean isDaemon()  : used to find a thread is daemon or not.
 */

public class MultiThreading10 extends Thread{
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("Daemon Thread !! "+Thread.currentThread().getName());
        }else {
            System.out.println("User Thread !! "+Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {
       MultiThreading10 mh=new MultiThreading10();
       MultiThreading10 mn=new MultiThreading10();

       mh.setDaemon(true); // setting this thread a daemon

       mn.start(); // starting the user thread for execution
       mh.start();

       /*
       if start first then declare thread as daemon thread then we will
       get IllegalThreadStateException.
        */
      //  mn.setDaemon(true);
    }

}
