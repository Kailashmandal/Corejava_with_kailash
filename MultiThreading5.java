public class MultiThreading5 extends Thread{
    public void run(){
//        String s=th.getName();
        for (int i=1;i<6;i++ ){
            Thread th=Thread.currentThread();
            String s=th.getName();
            try {
                th.sleep(500);
            }catch (InterruptedException e){
                System.out.println(e);
            }
            System.out.println(i+" "+s);

        }
    }

    public static void main(String[] args) throws InterruptedException{
        MultiThreading5 th=new MultiThreading5();
        th.start();
       //  th.sleep(400);
        // sleep() method execution with main thread
        for(int i=1;i<6;i++) {
            System.out.println(i + " " + Thread.currentThread().getName());

           // Thread.sleep(500); // it will be called for main thread

        }
    }
}
