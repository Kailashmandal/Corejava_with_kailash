/*
    Function overriding : function having same signature but differently behave at run time when it is
    called.
 */

class Bike{
    void run(){
        System.out.println("bike class");
    }
}
class splendor extends Bike{
    void run(){
        System.out.println("splendor class");
    }
}
public class Polymorphism2 {
    public static void main(String[] args) {
        Bike ref=new splendor(); // upcasting
        ref.run(); // splendor class run() is called
    }
}
