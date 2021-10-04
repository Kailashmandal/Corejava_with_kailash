/*
Priority in threads : we can also give the priority of threads and higher priority get
executed first.

Thread class have three static variables :
          1.  public static int MIN_PRIORITY=1
          2. public static int NORM_PRIORITY=5
          3. public static int MAX_PRIORITY =10
                    we can use this for giving priority to threads.
          or give any priority
 setPriority() : is a method used to give priority to threads it take an argument as integer value.

 getPriority() : is function used to get priority of thread it return an integer value
 */
public class MultiThreading9 extends Thread{
    public void run(){
        for(int i=1;i<6;i++){
            System.out.println(i+"."+Thread.currentThread().getName()+" is running...");
        }
    }

    public static void main(String[] args) {
        MultiThreading9 mh1,mh2,mh3 ;
        mh3=new MultiThreading9(); // default priority is 5 of each thread
        mh1=new MultiThreading9();
        mh2=new MultiThreading9();
        mh1.setPriority(Thread.MIN_PRIORITY);
        mh3.setPriority(Thread.MAX_PRIORITY);

        // or we can give any number 1 to 10 1 and 10 are included
      mh2.setPriority(7);

      mh1.setName("Mandal");
      mh2.setName("Kumar");
      mh3.setName("Kailash");

        mh1.start();
        mh2.start();
        mh3.start();


        System.out.println("Priority of mh1 is : "+mh1.getPriority());
        System.out.println("Priority of mh2 is : "+mh2.getPriority());
        System.out.println("Priority of mh3 is : "+mh3.getPriority());

    }
}
