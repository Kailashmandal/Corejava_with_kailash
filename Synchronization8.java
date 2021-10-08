/*
Deadlock in java : Deadlock occurs in the situation where thread t1 is waiting for an object lock which is
already locked by another thread t2 and t2 is waiting for the object lock which is already locked by thread t1 .
since object are waiting for there execution so this is called deadlock situation.
 */

public class Synchronization8 {
    /*
    creating deadlock situation :
    1.create two resources/ objects of and class.
    2.create two thread classes with two synchronized block in each that uses the object.
    3.create the objects of threads class and call start method.
     */

    //creating two resources
    private final static String resource1="Java";
    private final static String resource2="Spring Boot";
    public static void main(String[] args) {
        Thread t1=new Thread(){ // creating first anonymous class
            public void run(){
                synchronized (resource1){ // first synchronized block
                    System.out.println("t1 locked "+resource1);
                }

                try {
                    Thread.sleep(400);
                }catch (Exception e){
                    System.out.println();
                }
                // creating 2nd synchronized block
                synchronized (resource2){
                    System.out.println("t2 is locked "+resource2);
                }
            }

        };// ending 1st anonymous class

        // create 2nd anonymous class same as 1st
        Thread t2=new Thread(){
            public void run(){
                synchronized (resource2){
                    System.out.println("t2 have locked "+resource2);
                }
                try {
                    Thread.sleep(400);
                }catch (Exception e){
                    System.out.println();
                }
                synchronized (resource1){
                    System.out.println("t2 have locked "+resource2);
                }
            }
        };
        // call any one
       // t1.start();
        t2.start();

    }
}
