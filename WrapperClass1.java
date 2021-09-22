public class WrapperClass1 {
    /*
    Wrapper classes in java.
    Wrapper class is a class whose object wraps or contains primitive data types.
    btye-Byte
    boolean -Boolean
    int -Integer
    long-Long
    double -Double etc.
     */
    public static void main(String[] args) {
        int myint=50; // primitive
        Integer myInteger=Integer.valueOf(myint); // using wrapper class

        System.out.println("int is "+myint);
        System.out.println("Integer is "+myInteger);
        /*
        for primitive memory is allocated in stack.

        for Wrapper class reference variable memory is allocated in heap.
        internally valueof function returns new object.
        
         public static Integer valueOf(int i) {
        if (i >= IntegerCache.low && i <= IntegerCache.high)
            return IntegerCache.cache[i + (-IntegerCache.low)];
        return new Integer(i);
    }
         */

        // 2nd way of initialization
        Integer i=new Integer(25 /*give a int type value*/); // but it does not give better performance than int
        System.out.println(i);

    }
}
