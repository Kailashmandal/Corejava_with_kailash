import java.util.Scanner;

public class String1 {
    /* String is class in java objects of which represents sequence 
    of charactors .

    syntax of declaration :

     String ref_name= "kailash";

     OR
     
     String ref_name= new String("kailash");

     */

     public static void main(String[] args) {
         Scanner in=new Scanner(System.in);
         String name="kailash";
         // taking input
         System.out.println("enter name1:"); 
         
          String name1=in.nextLine();
         System.out.println("name is : "+name);
        System.out.println("name1 is : "+name1);


         /* camparision in string object :

         if two string reference have same value then they will point to same 
         object in heap memory .

         but strings are immuteable we can not update the 
         value by any reference , only we cane create a new object.

         */

         // for example

         String a="java";
         // and 
         String b="java"; 
         /* a and b both refer to same object in heap memory
            so they are equal */
            System.out.print("Is a and b equal ? : ");
         System.out.println(a==b); 
         
         /* if we want that we have same value but different obj. then
          */
          String x=new String("string");
          String y= new String("string");
         System.out.print("Is x and y equal ? : "); 

         System.out.println(x==y); 

         /* if we want check that two references are equal in 
         value or not then use equals() method */
         System.out.print("check by value : "); 
         System.out.println(x.equals(y)); 

  in.close();
     }
}
