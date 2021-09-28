/*
nested interface and nested class with interface .

interface A{
    methodA();
    interface B{
        methodB();
        }
 }
   //OR

class A{
methodA();
   interface B{
       methodB()
       }
 }

 */

class Language{
    void print(){
        System.out.println("Java !");
    }

    interface Java{   // nesting an interface in a class
        void Api();
    }
}
public class Interface7 implements Language.Java{
    public void Api(){
        System.out.println("Learn java Api ! ");
    }

    public static void main(String[] args) {
        Language ln=new Language();
        ln.print();

        Interface7 in=new Interface7();
        in.Api();  // Api can be only accessed trough object of implementing class.
    }
}
