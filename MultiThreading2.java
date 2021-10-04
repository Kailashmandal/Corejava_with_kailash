/*
We can create the multi thread also which is the main purpose of threading .

currentThread() : is method that returns the  object of a current thread in execution.
   we can call it by putting class name dot currentThread() .
   syntax:
           Thread.currentThread() ; return an object of Thread class

getName() : a method that returns the name of the thread.
     syntax:    Thread_object.getName() ;

     default names are : thread-0 , thread-1 , thread-2 and so on .... given by JVM
 */
class Thread2 extends Thread{
    public void run(){
        System.out.println("My Threads !! ");
        for(int i=1;i<6;i++){
            Thread t=Thread.currentThread(); // give an object of current Thread in execution .
            String name=t.getName();   // storing the thread name in String
            System.out.println(i+" "+name);
        }
    }
}
public class MultiThreading2 {
    public static void main(String[] args) {
        Thread2 t1=new Thread2();
        Thread2 t2=new Thread2();
        /*
        We always have a thread : main thread created by the JVM to execute the main method program.
         */

        Thread MainThread=Thread.currentThread();// getting the instance of main thread
        String MainThreadObject=MainThread.getName(); // storing the name of main thread.
        System.out.println(MainThreadObject);
        t1.start();  // now t1 is in thread pool
        t2.start(); // now t2 is in thread pool

        // note :  each time output may be different !!
    }
}
