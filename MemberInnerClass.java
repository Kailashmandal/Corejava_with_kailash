/*
Member inner class: it is like the members of the outer class .
-> can access all members of the outer class
-> syntax of creating the object :
             outerClass outerRef=new outerClass();
             outerClass.InnerClass  innerRef=outerClass.new InnerClass();
 */
public class MemberInnerClass {
    private int outerData=10;

    class InnerClass{
        private int innerData=30;

        void innerShow(){
            innerData++;
            System.out.println("inner data is : "+innerData);
            System.out.println("outer data is : "+outerData);
        }
    }
    void outerShow(){
        // inner class member can not be accessed by outer class methods
      System.out.println("inner data is : "+innerData); // will give error

        // comment this 
    }
    public static void main(String[] args) {
        MemberInnerClass outerRef=new MemberInnerClass();
        MemberInnerClass.InnerClass innerRef= outerRef.new InnerClass();

        innerRef.innerShow();

        // neither we can access through by the object of outer class
        outerRef.outerShow();
    }
}
