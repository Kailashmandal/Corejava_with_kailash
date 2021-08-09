import java.util.Scanner;
public class SwitchCases {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        /* suppose we have write a program where we have to take 
        input a fruit name and print one of its property.
        we can do this using if-else ladder and switch cases.
        */

        String fruit=in.next(); // taking input a fruit name
        /* syntax for switch statement is:
         
          switch(expression){
              case 1:
                 body;
                 break;
              case 2:
                 body;
                 break;
             default:
               body;

          }

          we can add as many cases we want.
          Note: 1. cases cannot be dupliate
                2. cases must have same type as expression.
                3. break; is used to terminate the sequence statement
          */
        System.out.print("Normal switch statement : ");
        switch (fruit){  // here expression is fruit 
            case "mango":  // mango is a case
                System.out.println("king of fruit");
                break;
            case "apple":  // apple is case
                System.out.println("red fruit");
                break;
            case "orange":  // orange is a case
                System.out.println("round fruit");
                break;
            case "berry":  // berry is a case
                System.out.println("small fruit");
                break;
            default:  // if non of the case will match default statement gets execute
               System.out.println("enter valid fruit name");
        }


       /* 
       In java we have enhanced switch statement
       in which break statement already added to end of 
       each case.
        */

       System.out.print("Enhanced switch statement : ");
        switch(fruit){
            case "mango" -> System.out.println("king of fruit");
            case "apple" -> System.out.println("red fruit");
            case "orange" -> System.out.println("round fruit");
            case "berry" -> System.out.println("small fruit");
            default -> System.out.println("enter a valid fruit name");
        }

        in.close();
    }
}


