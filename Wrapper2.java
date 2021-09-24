public class Wrapper2 {
    public static void main(String[] args) {
        /*
        Autoboxing: automatic conversion of primitive type to object of their corresponding wrapper class.
         */
        int x=10;
        Integer y=Integer.valueOf(x); // manual conversion of int to Integer

        Integer z=x; // automatic conversion of int to Integer valueOf() function is internally implemented

        System.out.println("x is : "+x);
        System.out.println("yis : "+y);
        System.out.println("z is : "+z);

        // Wrapper class into primitive type;

        Integer a=50;
        int b=a.intValue(); // this is manual conversion of object into primitive type

        /*
        Unboxing : Automatic conversion of object of wrapper class to corresponding primitive type.
         */

        int c=a; // automatic conversion , here intValue() function is included by compiler internally
        System.out.println("a is : "+a);
        System.out.println("b is : "+b);
        System.out.println("c is : "+c);
    }
}
