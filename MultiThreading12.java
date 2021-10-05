/*
Garbage collection in java : is used by java virtual machine to free the unused memory reference
                        Or its automatically reclaim the unused memory.

   unreferenced objects are best example of Garbage in java .
   1. by nulling the object
   2. by changing the object reference to other object.
 */
public class MultiThreading12 {
    public void finalize(){
        System.out.println("garbage collected !!");
    }

    public static void main(String[] args) {
        MultiThreading12 object1=new MultiThreading12();
        MultiThreading12 object2=new MultiThreading12();
        MultiThreading12 object3=new MultiThreading12();
        MultiThreading12 object4=object3; // object3 is now available for GC

        object1=null; // nullifying an object
        object2=null;

        System.gc(); // gc() garbage collection method

        /*
        Garbage collector collects only those waste or unreferenced object which is created with "new" keyword

        for others use finalize() method.
         */
    }
}