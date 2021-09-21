public class Student {
    public static void main(String[] args) {
        /* Object Initialisation from other classes.
        we can also access the reference variable of one class from other if class is public.

         */

        OOps ob1=new OOps();
        ob1.name="batman";
        ob1.tag=2;
        ob1.rating=9;
        System.out.println("Object initialisation from other class :");
        System.out.println("the name is : "+ob1.name+"\ntag is : "+ob1.tag+"\nrating is : "+ob1.rating);


        OOps ob2=new OOps();
        ob2.name="spider man";
        ob2.tag=3;
        ob2.rating=10;
        //System.out.println("Object initialisation from other class :");
        System.out.println("the name is : "+ob2.name+"\ntag is : "+ob2.tag+"\nrating is : "+ob2.rating);
    }
}
