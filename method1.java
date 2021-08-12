import java.util.Scanner;

public class method1 {
    public static void main(String[] args) {
        /* Method in java is collection of code that perform a 
        specific task like calculating sum, factorial,power or anything.
        */

        /* syntax of method is :

        access_specifier  returnType name(agrument list){
           // body ;
        }

        notice: agrument should be seprated by the coommas.
        */
        int ans=sum(); // calling sum function and storing sum into ans
        System.out.println("sum is : "+ans);
        
    }
    // suppose we want to create a metod for sum to two integers
    static int sum(){
        Scanner in=new Scanner(System.in);
        System.out.print("enter first number: ");
        int a=in.nextInt();
        System.out.print("enter second number: ");
        int b=in.nextInt();
        int s=a+b;
        return s; 
        
    }
   // we learn about static methods without creating an object of class 
   // we will see this OOPs.
    
}
