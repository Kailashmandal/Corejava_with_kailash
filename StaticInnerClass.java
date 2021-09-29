public class StaticInnerClass {
    static String s="static nested";
    static class StaticClass{
        void demo(){
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        StaticInnerClass.StaticClass sobj;
        sobj=new StaticInnerClass.StaticClass();
        sobj.demo();
    }
}
