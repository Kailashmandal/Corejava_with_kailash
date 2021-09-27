/*

Abstraction : is representing only essential info and hiding the unwanted details.

-> An abstract class must declare with "abstract" keyword.
-> An abstract class can not have any object only it can have reference variable.
-> An abstract class can have abstract methods and statics or non-static method as well.
->can have constructor .
->non-abstract class can not have any abstract method
 */
abstract class Base{
    abstract void show(); // only declaration of method is here
     // implementation is on derive class
}
class Der extends Base{
    void show(){ // implementation of abstract method show
        System.out.println("abstraction example ! ");
    }
}
public class AbstractClasses {
    public static void main(String[] args) {
        Base obj=new Der();
        obj.show(); //calling show method
    }

}
