class  X1{
    public int roll_no;
    private int age=10;
    protected String name;
    void display(){
        System.out.println("age is : "+age);
    }

}
class Y1 extends X1{ // y is derived class of the X
    void show(){
        roll_no=5;
        //age=21; can not inherit because of private access modifier
        name="kailash";

        System.out.println("roll_no is : "+roll_no +" "+"\nname is : "+name);
    }
}
public class BaseDerivedRef {
    public static void main(String[] args) {
        X1 x=new Y1(); // reference of base class but referring to child class
         // but now we can only use the inherited methods and fields with this reference
        x.display();
        //x.show(); we cannot use  this
    }
}
