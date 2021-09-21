import java.util.Arrays;

public class Strings {

    /* kailash mandal

   -> date-21/09/2021

   -> strings
     */
    public static void main(String[] args) {
        // how println works in the java

         System.out.println(56) ;
         // in java out isw reference variable in print stream and println is a method in print stream class
        /*
        println function internally calls valueof()
         function and valueof calls toString() method in java and similar process is executed by all parameters
         provides every argument is converted into the string then it is printed
            */
        System.out.println(Arrays.toString(new int[]{1,2,3,4,5})); //  array objects is also converted into string
        // when we write Arrays.toString we are actually overidding the default toString method
        // OR
        System.out.println("kailash"); // string also have function println

        // So basically println() function is overloaded for different arguments in java

    }
}
