/*
Nested Try block statement: we can have nested try catch block . a try catch block within the other try  catch block.

for example : try{
                     // code

                       try{
                          // code
                          }
                          catch(exception object){
                              // handling
                              }


                   }
                   catch(Exception obj ){
                            // handling
                            }
 */

import java.util.Scanner;

public class ExceptionHandling8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        try {
            int num1=Integer.parseInt(sc.nextLine());
            int num2=Integer.parseInt(sc.nextLine());
            int result=0;

            try {
                result=num1/num2;
                System.out.println("result is : "+result);
            }
            catch (ArithmeticException obj){
                System.out.println("ArithmeticException caught !! ");
                System.out.println(obj.getMessage());
                obj.printStackTrace();
            }
        }
        catch (NumberFormatException num){
            System.out.println("NumberFormatException caught !!");
            System.out.println(num.getMessage());
            num.printStackTrace();
        }
    }
}
