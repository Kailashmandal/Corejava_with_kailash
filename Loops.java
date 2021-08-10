import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        /*
        * syntax of for loops:
 
        for(initialisation;condition;increment/decrement){
            body ;
        }
        */
 
         Scanner in=new Scanner(System.in);
         int n=in.nextInt();
 
        // print the integer from 1 to n
         for (int i = 1; i <=n ; i++) {
             System.out.print(i+" ");
         }

         // for each loop :
         /* It is an Enhanced version of for loop used for arrays and collections.
            
         It works on element basics not index.

         no increment or decrement or subscript is required.

         sytax:

         for(data_type var : array){
             do something ;
         }

         note: var data_type should same as array.
         */
        System.out.println();
        System.out.print("elements of arrays are : ");
        int array[]={10,30,29,9};
        for (int i : array) {
            System.out.print(i+" ");  // printing elements of array
        }

         System.out.println(" ");
         // while loops
         /* Syntax of while loops:
 
         while(condition){
          body;
         }
          */
 
         int num=1; // initialisation
         while(num<=5){
             System.out.print(num+" ");
             num+=1; // increment statement
         }
 
         // do while loops syntax:
 
         /*
 
         do{
           body;
         }while(condition)
 
          */
          System.out.println();
         int x=1; // initialisation of x
         do{
             System.out.print(x);
             x++; // increment
         }while (x<=5); // condition
  
         // do_while will be executed at least single time
        in.close();
     }
}
