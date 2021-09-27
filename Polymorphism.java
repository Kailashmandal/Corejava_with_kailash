/*
polymorphism : 1. compile time or function overloading
               2. run time or function overriding
 */
class classA{
    void show(int x, float y){
        System.out.println("x= "+x+"y= "+y);
    }
    void show(String s ){
        System.out.println("s = "+s);
    }
}
public class Polymorphism {
    public static void main(String[] args) {
        classA obj=new classA();
        // same show() function with different number and type of arguments called function overloading
        obj.show("kailash");
        obj.show(50,50.9f);
    }
}
