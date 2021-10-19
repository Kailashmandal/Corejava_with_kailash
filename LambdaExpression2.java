/*
We can implement Runnable interface using lambda Expression since Runnable interface have only run()
abstract methods.
we do not have to create an implementation class for the Runnable interface.
 */
public class LambdaExpression2 {
    public static void main(String[] args) {

      Runnable myThread=()->{
          // it implements run() method internally
          System.out.println("MyThread is Running...");
      };

      Thread thd=new Thread(myThread); // creating thread of runnable interface

        thd.start();
        // or thd.run();
        
    }
}
