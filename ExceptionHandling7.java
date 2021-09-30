/*
Overriding and Exceptions :
        code will be compiled when parent class method throws unchecked exception and
        derived class method throws unchecked or same exception .

        if derive class method throws checked exception code will not compile.
 */
class Parent{
    void fun() throws ArithmeticException{

    }

}
class Child extends Parent{
    void fun() throws NumberFormatException{
  // this code will compile
    }
}
public class ExceptionHandling7 {
    public static void main(String[] args) {

    }

}
