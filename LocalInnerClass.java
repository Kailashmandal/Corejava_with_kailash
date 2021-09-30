/*
Local inner class : inner classes are classes that are defined inside a method scope , loop or If-Else clause etc.

 -> can access the all member of outer class
 */
public class LocalInnerClass {
    private String name="kailash";

    // a method of outer class.
    void show(){

        // an inner class.
        class InnerClass{

            //name="kumar";   // we can not update the data member of the outer class

            void showInner(){

                System.out.println(name);

            }
        }

       InnerClass in=new InnerClass();
        in.showInner();
    }

    public static void main(String[] args) {
        LocalInnerClass lo=new LocalInnerClass();

        lo.show(); // calling the method of outer class in which the inner class is present
    }
}
