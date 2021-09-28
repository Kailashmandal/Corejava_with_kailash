/*
Default method in interface : we can have default and static methods in interface, but we have to
                              declare it by using default and static keywords.

 similarly, we can have static methods .
 */

interface Year{
    default void Year1(){
        System.out.println("Default year have 365 days ! ");
    }
    static void Year2(){
        System.out.println("Leap year ! ");
    }
}
public class Interface6 implements Year{


    public static void main(String[] args) {
        Interface6 in =new Interface6();

        in.Year1();// calling Year1 method

        Year.Year2(); // calling Year2 static method

    }
}
