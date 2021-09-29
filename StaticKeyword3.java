public class StaticKeyword3 {
    /*
    we can count the number of objects created of a class by using static variables.
    but not with non-static variables .

    example: --
     */
    static int count1=0; // static count variable
    int count2=0;
    StaticKeyword3(){
        System.out.println("Object is created ! ");
        count2++; // increasing counting
        count1++;  // increasing count of static variable

        System.out.println("static count : "+count1);
        System.out.println("non-static count : "+count2);
    }

    public static void main(String[] args) {
        StaticKeyword3 obj1=new StaticKeyword3(); // creating a number of objects
        StaticKeyword3 obj2=new StaticKeyword3();
        StaticKeyword3 obj3=new StaticKeyword3();
        StaticKeyword3 obj4=new StaticKeyword3();

        /*
        every time object is created count2 is set to 1.
        but static count increasing gradually 1 to 4.
         */
    }
}
