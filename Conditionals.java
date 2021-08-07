public class Conditionals {
    public static void main(String[] args) {
       /* The if-else statement is most basic flow control statement 
          if condition is true if body will get executed otherwise 
        else body gets execute.

       syntax:

       if(condition expression){
         if  body;
       }
       else{
           else body;
       }

       note: else statement is optional for main task
       */
      
       /* suppose a student required minimum 35 marks 
       for passing the exam then find he is pass or not */

       int marks=40; // suppose marks obtained is 40 
       if(marks>=35){
           System.out.println("passed !!");
       }
       else{
           System.out.println("Hard work required !!");
       }
      
       // it will print passed !!  but you can change the value of marks and check .
    }
}
