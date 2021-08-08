import java.util.Scanner; // import Scanner class
public class UserInput2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        // here input is object of Scanner class
        // system.in is used for taking input from keyboard

        System.out.print("enter an integer");
        /* syntax is :

         data_type variable_name=object_name.method;
         */
        int my_integer=input.nextInt(); // nextInt() is usd for integer

        System.out.print("enter a character");
        char my_char=input.next().trim().charAt(0);
        /* here next() is used for single string

        trim() is used for trimming space before actual string

        charAt() is string method used for accessing character at any index.
        0th index will be first character by default.
         */


        System.out.println("enter a long integer");
        long my_long=input.nextLong(); // nextLong() for long integer values

        /*

        double my_double=input.nextDouble();
        float my_float=input.nextFloat();
        String my_string=input.nextLine();

         */

        System.out.println("my integer is : "+my_integer);
        System.out.println("my character is :"+my_char);
        System.out.println("my long integer is : "+my_long);

        input.close(); // closing the inputs

    }
}
