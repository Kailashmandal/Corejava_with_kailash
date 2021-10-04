public class MultiThreading4 extends Thread{
    public void run(){
        System.out.println("My threads !! ");
        for (int i=1;i<6;i++){
            Thread th=Thread.currentThread();
            String str=th.getName();
            System.out.println(i+" "+str);
            try {
                Thread.sleep(500,50);
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }
    public static void main(String[] args) {
        MultiThreading4 t1=new MultiThreading4();
        MultiThreading4 t2=new MultiThreading4();
        /*
        Sleep() method :
              working :  the thread which calls this method get blocked for specified times in arguments

               internal implementation :-
               public static void sleep(long milliSeconds) throws InterruptedException
                          OR
               public static void sleep(long milliseconds , int nanos ) throws InterruptedException.

               syntax : thread_object.sleep(value) ;
         */

        t1.start();
        t2.start();

    }
}
