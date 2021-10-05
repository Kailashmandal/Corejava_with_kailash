/*
Shutdown Hook Thread :  is used to perform cleanup activity when JVM shutdown normally or abnormally
                       cleanup like : database closing , resource release etc.

                       use : it is used when we want to execute some code when JVM is shutting down .
        functions :
        1. public void addShutDownHook(thread object) : used to register a thread as shutDownHook thread

        2. public void removeShutDownHook(thread object) : used to remove a register thread to normal

      **  press ctrl+c for shutting down the JVM and start executing the ShutDownHOOk thread

 */
class Demo extends Thread{
    public void run(){
        System.out.println("SHUTDOWNHOOK EXECUTION !!");
    }
}
public class MultiThreading11 {
    public static void main(String[] args) throws InterruptedException{
       Demo dh=new Demo();
       /*
       getRuntime() is a class Runtime method used to get instance of the class Runtime
        */
       Runtime r=Runtime.getRuntime();

       r.addShutdownHook(dh/*thread hook*/);
      //  System.out.println(Thread.currentThread().getName());
       for(int i=0;i<6;i++){
          System.out.println(i+" "+Thread.currentThread().getName()+" is running..");
           Thread.sleep(500);
       }

    }
}
