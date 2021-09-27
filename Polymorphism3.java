/*\
Runtime polymorphism with hierarchical inheritance.
 */
class Bank{
    float Interest(){
        return  0;
    }
}
class SBI extends Bank{
    float Interest(){
        return  8.4f;
    }
}
class AXIS extends Bank{
    float Interest(){
        return 4.5f;
    }
}
class ICICI extends Bank{
    float Interest(){
        return  9.7f;
    }
}
public class Polymorphism3 {
    public static void main(String[] args) {
        Bank obj;
        obj=new SBI();
        float sbi=obj.Interest();
        System.out.println("sbi ="+sbi);

        obj=new AXIS();
        System.out.println("axis = "+obj.Interest());

        obj=new ICICI();
        System.out.println("ICICI = "+obj.Interest());

        obj=new Bank();
        System.out.println("Bank= "+obj.Interest());
    }

}
