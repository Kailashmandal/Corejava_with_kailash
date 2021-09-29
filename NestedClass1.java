public class NestedClass1 {
    private String str1="Outer class";
    class Innerclass{
        void demo(){
            System.out.println("str1 is : "+str1);
        }
    }

    public static void main(String[] args) {
        new NestedClass1().new Innerclass().demo();

        //OR
        NestedClass1 obj=new NestedClass1();
        NestedClass1.Innerclass in=obj.new Innerclass();
        in.demo();
    }
}
