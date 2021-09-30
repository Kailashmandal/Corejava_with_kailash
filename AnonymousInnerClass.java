/*
Anonymous inner class: Inner class without any name is known as anonymous
  -> declaration of anonymous class is just an expression .
  -> these are created in a single expression at the time of use
  -> name of Anonymous class is decided by JVM at runtime
 */
abstract class person{
    // an abstract class with a method show()
    abstract void show();
}
public class AnonymousInnerClass {
    public static void main(String[] args) {

        person p=new person() {  // Anonymous class extending abstract class person
             void show(){
                System.out.println("Anonymous class example !");
            }
        };

        p.show();
    }

}
