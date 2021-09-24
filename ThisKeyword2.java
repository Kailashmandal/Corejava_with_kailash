class A1{
    int roll_no;
    String name;
    A1(){

        this(10,"kailash"); // this will call the parameterised constructor
        System.out.println("Parameterised constructor called.");

    } // default constructor
    A1(int r,String n){ // parameterised constructor

        System.out.println("roll no "+r);
        System.out.println("name "+n);
    }

    A1(int x){
        this(); // calling default constructor.
        System.out.println("x is "+x);
    }

    /*
    we can use this keyword for current class method calling also.
     */

    void method1(){
        System.out.println("method1 is called.");
    }
    void method2(){
        this.method1(); // this will method1
    }

}
public class ThisKeyword2 {
    public static void main(String[] args) {
        A1 a=new A1(3);
        a.method2();
    }
}
