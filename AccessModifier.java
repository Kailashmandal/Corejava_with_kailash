/*
a class can inherit only those data or structure which are public or default or protected not private
 */
class  X{
    public int roll_no;
    private int age;
    protected String name;

}
class Y extends X{ // y is derived class of the X
    void show(){
        roll_no=5;
        //age=21; can not inherit because of private access modifier
        name="kailash";

        System.out.println("roll_no is : "+roll_no +" "+"\nname is : "+name);
    }
}
public class AccessModifier {
    public static void main(String[] args) {
        Y y=new Y();
        y.show();
    }
}
