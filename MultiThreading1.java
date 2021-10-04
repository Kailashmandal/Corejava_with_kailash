/*
Thread : a thread is a lightweight sub-process and the smallest unit of execution.
        without a thread we can not perform any execution of program,so when we say that
        program or code is executing actually it is thread that executes.

        We have Thread class in java which provides the constructor for threads execution and creations.
 */

// creating a thread by extending the Thread class
class Thread1 extends Thread{

    // a run method is already present in the Thread class we are overriding it here.
    public void run(){
        System.out.println("My thread !! ");
        for(int i=1;i<6;i++){
            System.out.println(i);
        }
    }
}
public class MultiThreading1 {
    public static void main(String[] args) {
        // Create a thread object here
       Thread1 t1=new Thread1();
       t1.start();// start will call internally run() method.
    }
}
