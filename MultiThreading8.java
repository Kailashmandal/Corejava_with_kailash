/*
setName() : is method used to set the name of any thread .takes string as an argument

getId() : return the unique long integer value of thread in the program.
 */
public class MultiThreading8 extends Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" "+"is running...");
    }

    public static void main(String[] args) {
        MultiThreading8 mh=new MultiThreading8();
        mh.start(); // mh is thread-0 here

        // changing the name
        mh.setName("kailash"); // now mh is kailash here

        MultiThreading8 nh=new MultiThreading8();
        String s=nh.getName(); // default name is thread-1
        System.out.println("nh name is : "+s);
        int nhId=(int)nh.getId();
        int mhId=(int)mh.getId();
        System.out.println("Id is nh is : "+nhId+"\nId of mh is : "+mhId);
    }
}
